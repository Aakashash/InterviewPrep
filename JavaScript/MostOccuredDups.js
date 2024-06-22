const a = [2, 2, 1, 3, 4, 4, 5, 23, 34, 22, 44, 22, 33, 12, 23, 12, 12];

const value = new Map();

value.set(2, 0);
value.set(3, 0);

var t = a.includes(2);

console.log(t);

a.forEach((element) => {
  if (value.has(element)) value.set(element, value.get(element) + 1);
  else value.set(element, 1);
});

console.log(value);

const newmap = new Map(Array.from(value.entries()).sort((a, b) => b[1] - a[1]));

// const as = Array.from(value);

//const newmap = new Map(Array.from(value.entries()).reverse());

// console.log(newmap);

function getKey(val) {
  for (let [key, value] of newmap.entries()) {
    if (value === val) return key;
  }
}
// console.log(getKey(3));
// console.log(newmap.size);
let x = 0;
let ram = false;
for (let index = 0; index < newmap.size - 1; index++) {
  if (newmap.get(index) != newmap.get(index + 1) || ram == true) {
    x++;
    console.log(getKey(newmap.get(index)));
    if (x == 2) {
      ram = true;
      console.log(getKey(newmap.get(index)));
    }
  }
  ram = false;
}
