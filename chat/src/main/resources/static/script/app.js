let Ch = (have_an_account) =>{
    if(have_an_account){
        document.getElementById("login-cont").style.display = "none";
        document.getElementById("reg-cont").style.display = "flex";
    }else{
        document.getElementById("login-cont").style.display = "flex";
        document.getElementById("reg-cont").style.display = "none";
    }
}

Ch(false);