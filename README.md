# I Am Code

A console-based Java program that collects "I am..." statements from the user and combines them into a single sentence listing their qualities. It was written as **Week 10 – Lab 7**.

## Overview

The program repeatedly asks the user to type sentences until they enter a single period (`.`). Any sentence that starts with `I am` is kept, and the words after `I am ` are added to the result. All other sentences are ignored. When the user finishes, the program prints the combined result.

## Features

- Reads input line by line with `Scanner.nextLine()`
- Uses a `while` loop with a sentinel value (`.`) to end input
- Filters sentences with `String.startsWith()`
- Extracts the quality from each sentence with `String.substring()`
- Builds the final sentence through string concatenation

## Requirements

- Java Development Kit (JDK) 8 or higher

## How to Run

1. Clone the repository:
```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name
```

2. Compile the program:
```bash
   javac IAmCode.java
```

3. Run it:
```bash
   java IAmCode
```

## Example Usage

```
WEEK 10 - Lab 7
Please enter sentences, . to end.
I am kind
Today is Friday
I am brave
.
The qualities are kindbrave
```

The sentence "Today is Friday" is ignored because it doesn't start with `I am`.

## How It Works

1. `resultSentence` starts as `"The qualities are "`.
2. Each line the user enters is checked with `startsWith("I am")`.
3. If it matches, `substring(5)` removes the first five characters (`I am ` including the space), and the rest is appended to `resultSentence`.
4. The loop ends when the user enters `.`, and the final sentence is printed.

## Known Limitations

- **No separators:** qualities are joined directly with no spaces or commas (for example, `kindbrave`).
- **Case sensitive:** `i am happy` or `I AM happy` will be ignored.
- **Partial matches:** a word like `I amazing` also starts with `I am`, so it would be processed incorrectly.
- **Crash on short input:** entering exactly `I am` (with nothing after it) causes a `StringIndexOutOfBoundsException`.

## Possible Improvements

- Add `", "` or `" and "` between qualities for a readable sentence
- Check for `"I am "` (with a trailing space) to avoid partial matches
- Make the check case-insensitive with `toLowerCase()` or `startsWith` on a normalized string
- Handle the case where no qualities were entered

## License

This project is for educational purposes.
