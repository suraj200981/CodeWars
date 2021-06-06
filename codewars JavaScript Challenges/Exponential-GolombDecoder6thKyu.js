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

console.log(decoder(22));

//function
function decoder(sequence){
    var newVal =0;
    newVal += sequence+1 //x+1
    return (newVal >>> 0).toString(2);
  }