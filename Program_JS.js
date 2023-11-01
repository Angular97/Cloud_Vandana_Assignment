function reverseWordsInSentence(sentence) {
  const words = sentence.split(" ");
  const reversedWords = words.map((word) => reverseWord(word));

  const reversedSentence = reversedWords.join(" ");

  return reversedSentence;
}

const reverseWord = (word) => word.split("").reverse().join("");

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);

//Perform sorting of an array in descending order.

const array = [5, 2, 9, 1, 5, 6];
array.sort((a, b) => b - a);
console.log(array);
