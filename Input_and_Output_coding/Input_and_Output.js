
let name = prompt("Enter your name:");
console.log("Hello", name);

let age = parseInt(prompt("Enter your age:"), 10);

console.log(`My name is ${name} and I am ${age} years old`);

console.log("Name: " + name + ", Age: " + age);

//  Type check
console.log(typeof name); // string
console.log(typeof(age));  // number
