/*
Instructions:

Task: Decoding
The task of this kata is to take an exponential-Golomb encoded binary string and return the array of decoded integers it represents.

Encoding
An exponential-Golomb code is a way of representing an integer using bit patterns. To encode any non-negative integer x using the exponential-Golomb code:

Write down x + 1 in binary, without leading zeroes.
Count ( all ) the bits written, subtract one, and add that many zeroes to the front of the bit string.
Example
The value for 3 would be:

3 → 100 ( 3 + 1 in binary ) → 00100 ( 100 with two 0s preceding it )
The value for 22 would be:

22 → 10111 → 000010111
As such, a sequence of nonnegative integers can be represented as sequence of exponential-Golomb codes:

[3, 22, 0, 4, 12] → 00100 000010111 1 00101 0001101
Therefore, for this case, your function should take "001000000101111001010001101" and return [3, 22, 0, 4, 12].

*/

console.log(decoder([1,2,3]));

//function
function decoder(sequence) {

  var text = "";
  var i;
  for (i = 0; i < sequence.length; i++) {
    //converts to string 
    text += sequence[i] + 1;
    text.toString();

  }
  var newNumberString = text;

  var finalBinaryValue = "";

  var returningString = "";
  var bitsInFront="";
  
  var x;
  var y;
  //            ["01001100100", [1, 2, 3]],


  //converts each number to binary
  for (x = 0; x < newNumberString.length; x++) {
    //each binary val
    // console.log(newNumberString.charAt(x));
    finalBinaryValue+= (newNumberString.charAt(x)>>> 0).toString(2);
    // console.log("each binary val: "+finalBinaryValue);
    //putting 00s in front of binary val
    for (y = 0; y < finalBinaryValue.length-1; y++) {
      bitsInFront += "0";
    }
    // console.log("bits in front: "+bitsInFront);
    //bringing it all together
    returningString += bitsInFront +finalBinaryValue;
    // console.log()
    // console.log(returningString);
    // console.log()
    bitsInFront ="";
    finalBinaryValue ="";
  
  }

 
  return returningString;

}