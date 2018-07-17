const myObject = {
  name: "John",
  present: function(name) {
    console.log(`My name is ${name}`);
  }
};
 
const {name:john, present} = myObject;
 
present(john);