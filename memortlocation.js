
// stack = (primitive dataypes or values)
// heap = (stores Non-primitive values)

let user = {
    name: 'krishna',
    age: 19,
}

console.log(user);

let user1= user
user1.name = "krishna patidar"
console.log(user.name);
console.log(user1.name);