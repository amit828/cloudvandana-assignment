function sortDescending(array) {
    for (var i = 0; i < array.length; i++) {
      for (var j = i + 1; j < array.length; j++) {
        if (array[i] < array[j]) {
          var temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
  }

var array = [1, 5, 3, 2, 4];
var sortedArray = sortDescending(array);
console.log(sortedArray);