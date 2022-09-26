a = prompt("Hey! whats your age?")
console.log(a)
console.log(typeof a)//string
a = Number.parseInt(a)
console.log(typeof a)

// example of indian wedding criteria for girls 
if (a<10) {
    alert("this is student age" )

}
else if (a>10 && a<15) {
    alert(" this is not age for wedding")
}
else if (a>18 && a<21) {
    alert("we can think about wedding but not from 21")
}
else {
    alert("this is valid age for wedding")
}


