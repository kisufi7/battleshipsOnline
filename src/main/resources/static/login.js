const userNameEL = document.getElementById("nameInput");
const passwordEL = document.getElementById("passwordInput");
const loginForm = document.getElementById("loginForm");
const errorEL = document.getElementById("loginerror");


async function login(){
    const userName = userNameEL.value;
    const password = passwordEL.value;
    const URL = "/api/login";

    try{
        console.log(`API request sent to address ${URL}`);
        const response = await fetch(URL, {
            method : "POST",
            headers: {}

            
        })
    }
    catch (error){

    }

}

document.addEventListener("submit", login());