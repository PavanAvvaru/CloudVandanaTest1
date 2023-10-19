// A.. Take a sentence as an input and reverse every word in that sentence. 
function reverseWords(string) {
  const words=string.split(' ');
  const reversedWords=words.map(word => 
    {
      return word.split('').reverse().join('');
  });
  const reversedSentence = reversedWords.join(' ');
  return reversedSentence;
}
const Sentence=prompt("Enter a sentence:");
const result=reverseWords(Sentence);
console.log(result);

//B.Perform sorting of an array in descending order
function sortArrayDescending(arr)
{
  arr.sort(function(a,b) 
  {
      return b-a;
  }
  );
  return arr;
}
let input=prompt("Enter numbers separated by commas: ");
let numbersArray=input.split(',').map(Number);

let sortedArray=sortArrayDescending(numbersArray);
console.log(sortedArray);


