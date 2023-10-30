const prompt = require("prompt-sync")({sigint:true});
let str=prompt("please provide the string  ");
let str1=str.split("").reverse().join("");
let str2= str1.split(" ").reverse().join(" ");
console.log(str2);