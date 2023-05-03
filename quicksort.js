function quicksort(q) {
    var less = []
    var pivotList = []
    var greater = []
    if(q.length <= 1) {
        return q
    } else {
        pivotList = q.splice(0, 1);
        q.forEach(x => {
            if (x < pivotList[0]) less.push(x);
            if (x >= pivotList[0]) greater.push(x)
        });
    }
    return [...quicksort(less), ...pivotList, ...quicksort(greater)];
}

console.dir(quicksort([2,6,7,4,9,5,3,10,11,12]));