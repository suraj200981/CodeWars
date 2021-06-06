//The Barksdale Code

//instructions 

/* 
Fans of The Wire will appreciate this one. For those that haven't seen the show, the Barksdale Organization has a simple method for encoding telephone numbers exchanged via pagers: "Jump to the other side of the 5 on the keypad, and swap 5's and 0's."

Here's a keypad for visualization.

┌───┬───┬───┐
│ 1 │ 2 │ 3 │
├───┼───┼───┤
│ 4 │ 5 │ 6 │
├───┼───┼───┤
│ 7 │ 8 │ 9 │
└───┼───┼───┘
    │ 0 │
    └───┘
Detective, we're hot on their trail! We have a big pile of encoded messages here to use as evidence, but it would take way too long to decode by hand. Could you write a program to do this for us?

Write a funciton called decode(). Given an encoded string, return the actual phone number in string form. Don't worry about input validation, parenthesies, or hyphens.

example:     "4103432323": "6957678787" - taken from the sample tests

*/

function decode(string) {


    var newString = new String();

    newString = string;
    var convertedString = "";

    var i;
    for (i = 0; i <= newString.length - 1; i++) {
        if (newString.charAt(i) == "0") {
            convertedString += "5";
        } else if (newString.charAt(i) == "1") {
            convertedString += "9";
        } else if (newString.charAt(i) == "2") {
            convertedString += "8";
        } else if (newString.charAt(i) == "3") {
            convertedString += "7";
        } else if (newString.charAt(i) == "4") {
            convertedString += "6";
        } else if (newString.charAt(i) == "5") {
            convertedString += "0";
        } else if (newString.charAt(i) == "6") {
            convertedString += "4";
        } else if (newString.charAt(i) == "7") {
            convertedString += "3";
        } else if (newString.charAt(i) == "8") {
            convertedString += "2";
        } else if (newString.charAt(i) == "9") {
            convertedString += "1";
        }
    }

    return convertedString;

}

