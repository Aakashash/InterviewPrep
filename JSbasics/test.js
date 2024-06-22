console.log("Hello world");

let result = [];

const a = [2, 2, 1, 3, 4, 4, 4, 5, 23, 34, 22, 44, 22, 33, 12, 23, 12, 12];
result = a.filter((x, index) => {
  return a.indexOf(x) === index;
});
console.log(result);

