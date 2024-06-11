"use strict";

const testlib = require('./testlib.js');

let patterns = []; // store patterns
let inputBuffer = []; // buffer characters
let offset = 0; 
const counts = {}; // store counts for each pattern


testlib.on('ready', function (patternsFromLibrary) {
    patterns = patternsFromLibrary;
    console.log("Patterns:", patterns);
    testlib.runTests(); // start the tests
});

testlib.on('data', function (char) {

    inputBuffer.push(char);

    const bufferedData = inputBuffer.join('');
    patterns.forEach(pattern => {
        if (bufferedData.endsWith(pattern)) {
            
			counts[pattern] = (counts[pattern] || 0) + 1;
            testlib.foundMatch(pattern, offset);
            
        }
    });

    offset++;
});


testlib.on('reset', function () {
    inputBuffer = [];
    //offset = 0; // reset offset 
});


testlib.on('end', function () {
    
    testlib.frequencyTable(counts);
});

testlib.setup(2);
