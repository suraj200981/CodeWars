/*

Instructions:

This Kata is intended as a small challenge for my students

All Star Code Challenge #20

Create a function called addArrays() that combines two arrays of equal length, summing each element of the first with the corresponding element in the second, returning the "combined" summed array.
Raise an error if input arguments are not of equal length.

addArrays([1,2],[4,5]); // => [5,7]
addArrays([1,2,3],[4,5]); // => Error
Note:
Expect array input to either contain numbers or strings only
The function should also allow for concatenating string

addArrays(["a"],["b"]) // => ["ab"]

*/


console.log(addArrays([1,2], [4,5]));
function addArrays(array1, array2) {
  var arr1 = new Array();
  var arr2 = new Array();
  var finalArr = new Array();

  arr1 = array1;
  arr2 = array2;

  var i;
  if (arr1.length === arr2.length) {
    for (i = 0; i <= arr1.length-1; i++) {
      finalArr[i] = arr1[i] + arr2[i];
    }
    return finalArr;
  } else {
    return Error.captureStackTrace();
  }
}
