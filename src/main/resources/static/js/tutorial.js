const btn = document.getElementById("button1");

btn.addEventListener("click", ()=>{

    if(btn.value === "Red"){
        btn.value = "Blue";
    }else{
        btn.value= "Red";
    }
})