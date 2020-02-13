
function Vaildate(){
	//check if the two password match.
	var choosePwd = document.getElementById('choosepassword');
	var confirmPwd = document.getElementById('confirmpassword');
	
    if (choosePwd.value != confirmPwd.value) {
    	console.log("password miss match!")
    	alert ("password miss match!!");
/*        password.style.border = "1px solid red";
        document.getElementById('pass_confirm_div').style.color = "red";
        password_confirm.style.border = "1px solid red";
        password_error.innerHTML = "The two passwords do not match";*/
        return false;
    }
}