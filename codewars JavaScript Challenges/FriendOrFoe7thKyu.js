/*
Instructions:

Make a program that filters a list of strings and returns a list with only your friends name in it.

If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! Otherwise, you can be sure he's not...

Ex: Input = ["Ryan", "Kieran", "Jason", "Yous"], Output = ["Ryan", "Yous"]

i.e.

friend ["Ryan", "Kieran", "Mark"] `shouldBe` ["Ryan", "Mark"]
Note: keep the original order of the names in the output.

*/
const mates = ["Ryan", "Kieran", "Mark","2412"];

console.log(friend(mates));


//function
function friend(friends){

    String.prototype.isNumber = function () { return /^\d+$/.test(this); }

    const resultWithNumbers = friends.filter(name => name.length === 4);

    const resultWithoutNumbers = resultWithNumbers.filter(function (item) {
        return !(parseInt(item) == item);
      });
    return resultWithoutNumbers;

}