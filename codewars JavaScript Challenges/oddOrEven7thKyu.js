function oddOrEven(array) {

    var inputArr = new Array();
    inputArr = array;
    var i;
    var sum = 0;

    for (i = 0; i <= inputArr.length - 1; i++) {
        sum += inputArr[i];
    }
    if (sum % 2) {
        return 'odd'
    } else {
        return 'even'
    }
}
console.log(oddOrEven([0, -1, -5]));