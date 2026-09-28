const userNameEL = document.getElementById("nameInput");
const passwordEL = document.getElementById("passwordInput");
const loginForm = document.getElementById("loginForm");
const errorEL = document.getElementById("loginerror");

async function login(){
    const userName = userNameEL.value;
    const password = passwordEL.value;

    try{
        const response = await fetch("/api/login", {
            method : "POST",
            headers: {}
            
        })
    }
    catch (error){

    }

}

document.addEventListener("submit", login());