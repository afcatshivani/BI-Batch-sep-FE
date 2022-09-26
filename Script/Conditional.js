//prompt uses
a = prompt(" Hey! whats your age? this is required ques for your indetity")
console.log(a)// this is string type
console.log(typeof a)// string value
a = Number.parseInt(a)
console.log(typeof a)//number

//Alert use
// Take a exam for driving age criteria
if(a<0) {
    alert(" This is invalid age");
}
else if(a>10 && a<15)  {
    alert(" Now you are kid so you can't take drive");
}  
else if (a<18 || a>15) {
    alert(" you can think but after 18");
}
else {
    alert(" you can drive");
}

