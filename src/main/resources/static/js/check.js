var id = $.cookie('accId');
if(id === undefined){
    location.href = "login.html";
}