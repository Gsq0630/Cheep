$(function () {
    // $("#chk_name").focus(function () {
    //     $(this).parent().next().children().empty();
    // });
    //用在按钮处来判断身份证是否重复
    var check_tag;
    //表单验证
    $("#info_form").validate({
        rules: {
            chk_name: {
                required: true,
                regex: /^[\u4e00-\u9fa5]{2,20}$/
            },
            chk_card: {
                required: true,
                regex: /^\w{18}$/
            },
            form_post: {
                required: true,
                regex: /^\d{6}$/
            },
            chk_address: {
                required: true
            }
        },
        messages: {
            chk_name: {
                required: "姓名不能为空",
                regex:"姓名为2-20个汉字"
            },
            chk_card: {
                required: "身份证不能为空",
                regex: "身份证号码长度为18位"
            },
            form_post: {
                required: "邮政编码不能为空",
                regex: "邮政编码为6位数字"
            },
            chk_address: {
                required: "收货地址不能为空"
            }
        },
        errorPlacement: function (error, element) {
            $("span[name='card_emsg']").empty();
            $("span[name='card_smsg']").empty();
            element.parent().next().children().empty();
            error.appendTo(element.parent().next().children())
        }
    });
    //对身份证号的ajax
    $("#chk_card").blur(function () {
        $.ajax({
            url: "/verify/checkUsersCard",
            type: "post",
            data: {
                'usersCardid': $("#chk_card").val()
            },
            dataType: "text",
            success: function (data) {
                check_tag = data;
                var cardTag = $("#error_card");
                if($("#chk_card").val().length==18){
                    if (data == "true") {
                        $("span[name='card_emsg']").empty();
                        $("span[name='card_smsg']").empty();
                        cardTag.empty();
                        cardTag.append("<span class='success' name='card_smsg'>这个身份证号码未验证！</span>")
                    } else {
                        $("span[name='card_emsg']").empty();
                        $("span[name='card_smsg']").empty();
                        cardTag.empty();
                        cardTag.append("<span class='error' name='card_emsg'>这个身份证号码已验证！</span>")
                    }
                }

            }
        })
    });
    //性别选择
    $("input[name='chk_sex']").click(function () {
        $("#sex_tip").empty();
    });
    //插入的ajax

    $("#chk_button").click(function () {
        var UsersVo = {"accId":$.cookie("accId"),"users":{
                'usersRealname':$("#chk_name").val(),
                'usersCardid':$("#chk_card").val(),
                'usersSex':$("input[name='chk_sex']:checked").val(),
                'usersPostid':$("#form_post").val(),
                'usersAddress':$("#chk_address").val()
            }}
        if($("input[name='chk_sex']:checked").val()==null){
            $("#sex_tip").empty();
            $("#sex_tip").append("<span class='error' name='sex_emsg'>请选择性别！</span>")
        }else{
            $.ajax({
                url: "/verify/insetUsers",
                type:"post",
                data:JSON.stringify(UsersVo),
                dataType: "text",
                contentType:"application/json;charset-UTF-8",
                success:function (data) {
                    if(check_tag == "true" && data == "true"){
                        $("#chk_main").css("display","none");
                        $("#chk_over").css("display","inline");
                        $("p[name='chk_welcome']").append($("#chk_name").val())
                    }else{
                        alert("验证失败！")
                    }
                }
            })
        }

    });
});