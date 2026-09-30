const userNameEL = document.getElementById("nameInput");
const passwordEL = document.getElementById("passwordInput");
const loginForm = document.getElementById("loginForm");
const HTMLresponse = document.getElementById("response");


async function login(){
    const username = userNameEL.value;
    const password = passwordEL.value;
    const URL = "/api/login";

    try{
        console.log(`API request sent to address ${URL}`);
        const response = await fetch(URL, {
            method : "POST",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify({username,password})  //das mal ohne json.stringify probieren aus interesse
        })
        if(response.ok){
            HTMLresponse.innerText= "login successful";
        }
        else HTMLresponse.innerText= "login failed. please check password and/or username";


    }
    catch (error){
        console.log(error)
        HTMLresponse.innerText = "an unknown error has occurred"; //praying that ts never gets called upon lol

    }

}

document.addEventListener("submit", (event) => {
    event.preventDefault();
    login();})