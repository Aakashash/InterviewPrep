console.log("Hello world");
/*
function display1() {
  console.log("Im the first function");
}
function display2() {
  console.log("Im the second function");
}
function display3() {
  console.log("Im the third function");
}

function result(display1, display2) {
  display1();
  display2();
}

result(display1, display2);
*/
/////////////////////////////////////////////////////////
// callback function
/*
function data() {
  console.log("second function called");
}

function first(data) {
  console.log("first function called");
  data();
}

first(data);
*/
/////////////////////////////////////////////////////////

/*
function display(data, callback) {
  console.log("The value is " + data);
  callback(data + 1, callback1);
}

function callback(value, callback1) {
  console.log(value + 20);
  const res = value + 20;
  callback1(res + 20);
}

display(10, callback);

function callback1(value) {
  console.log(value + 1);
}

*/
////////////////////

// example of callback functiion - this is easy to understand because of just two function
// but if we have more function it is very difficult to understand so  termed as callback hell
// hence promise has beeen introduced
/*
const f1 = (val, callback) => {
  return callback(val + 10);
};

const callback = (val) => {
  return val + 10;
};
console.log(f1(1, callback));   
*/
// same above example is done by promise in line 85
// promise
/*
var x = 20;
const p = new Promise((resolve, reject) => {
  if (x == 10) resolve("Success");
  else reject("failure");
});

p.then((val) => {
  console.log(val);
}).catch((val) => {
  console.log(val);
});
*/
// example using promise
/*
const pr = (val) =>
  new Promise((resolve, reject) => {
    resolve(val + 10);
  });

pr(1).then((x) => {
  console.log(x + 10);
});

*/
/// await and async
// await can only be used inside a async function block
//if we use await inside async then all the await statement will be executed synchronys way

// async function always returns a promise obj only
async function myfn() {
  return 1;
}
console.log(myfn());
// example of how to increment one by using promise
/*
function myfun(data) {
  increment(data)
    .then((res) => increment(res))
    .then((res) => increment(res))
    .then(console.log);
}

function increment(data) {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve(data + 1);
    }, 1000);
  });
}
myfun(10);
*/
//  same example of how to increment one by using async and await

async function fun1(data) {
  const a = await incrementOne(data);
  const b = await incrementOne(a);
  const c = await incrementOne(b);
  console.log(c);
}

function incrementOne(data) {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve(data + 1);
    }, 1000);
  });
}

fun1(10);

/*
if we use promise we need to use then function to get the values 
but if we use await we can directly store it in a variable and we can use it 
if we use promise error can be handled using catch block
but if we use await we need to use try and catch block

///

callback
promise
async and await

call back may get turned to callback hell hence promise was introduced
but promise can also be turned to promise hell chances are there so we can use async and wait
for better understandabiity and code reduction. 
*/
