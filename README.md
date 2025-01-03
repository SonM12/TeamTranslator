# The Translator
## Contributors and GitHub Usernames:
Julia Zaki / julia-zaki

Christina Huang / HChristinaH

Edan Wong / 903Edan

Manjun Zhu / Karrrrmen

Mingyu (Roy) Son / SonM12

## Table of Contents

1. [Summary of the project's purpose](#1-summary-of-the-projects-purpose)

2. [Features of the Software](#2-features-of-the-software)

3. [Installation Instructions](#3-installation-instructions)

4. [Usage guide](#4-usage-guide)

5. [License](#5-license)

6. [Feedback](#6-feedback)

7. [Contributions](#7-contributions)


## 1. Summary of the project's purpose
The program is a translation tool designed to help users for translating text and files between multiple
languages, switching between input and output languages, converting images to text for translation, providing
pronounciation of the translated text and usage-tracking for character used. The program aims to solve problems 
regarding language barriers bewteen different media. This program is useful for new language learners, people who
work with foreign language materials, or people who need efficient translation tools to encounter everyday situations.

## 2. Features of the Software

The Translator has mutlitple features which include:<br><br>


1. **Translate Text**

The translate text use case allows the user to translate text from one language to another.

<ins>Example user story:</ins>
Emily is learning Spanish for the first time. Her Spanish assingment requires her to write about her summer vacation.
However, Emily forgot how to say "beach" in Spanish. She uses The Translator to translate the word "beach" from English
to Spanish. The Translator gives her back "playa" which is the correct Spanish word for "beach".

<ins>Example use case tutorial:</ins>

[Text Translator Demo](Resources/Translate%20Text.mov)<br><br>

2. **Switch Translation**

The switch translation use case allows the user to switch the input language to become the ouput language and
vice-versa. It also allows the user to switch the input text to become the ouput text and
vice-versa.

<ins>Example user story:</ins>
Julia is translating a sentence from English to her second language, French. She wants to make sure that the generated
translation is correct. She clicks the switch button and ends up with the translated French sentence as the input and
the English sentence she originally wrote as the output. She reads that English translation and sees that it makes
sense and does communicate the same point as what she had originally written (it could be the exact same thing she had
inputted but sometimes translators can alter the sentence). This helped her ensure that the French translation that was
generated by the program was indeed correct.

<ins>Example use case tutorial:</ins>

[Switch Translation Demo](Resources/Switch.mov)<br><br>

3. **Translate File**

The translate file use case allows the user to input a file and translate the text in the file into their chosen
language.

<ins>Example user story:</ins>
Edan is currently enrolled in a Korean learning course and several course materials are distributed in different
format of files. He wants those text in the files to be translated directly into his mother language so that he
does not have to copy and paste the text from the file into the translator. Therefore, he uses the
translate-file feature to translate the materials in an efficient way.

<ins>Example use case tutorial:</ins>

[Translate File Demo](Resources/TranslateFileUseCase.mp4)<br><br>

4. **Translate Image**

The translate image use case allows the user to input an image and translate the text in the image into their chosen
language.

<ins>Example user story:</ins>
Christina is studying abroad in Japan and sees a sign at a subway. She is not very familiar with Japanese and she
cannot easily type in the characters into her translation app so she uses the convert image to text feature to take
a picture and translate the sign.

<ins>Example use case tutorial:</ins>

[Translate Image Demo](Resources/ImageUploadDemo.mp4)<br><br>

5. **Check Usage**

The check usage use case allows the user to check whether their input text is within the free-tier limit of the 
translator to avoid payments.

<ins>Example user story:</ins>
Karmen is working on a history assignment that requires translating a lengthy article from a foreign language. 
To ensure she stays within the free-tier limits of the translation service, she needs to monitor the character count 
and limit from the App. Using the "CheckUsage" feature, Karmen can track her usage, avoid exceeding the limit and 
complete her assignment without unexpected costs.

<ins>Example use case tutorial:</ins>

[Check Usage Demo](Resources/CheckUsageDemo.mov)<br><br>

6. **Text to Speech**

The text to speech use case allows the user to listen to the pronounciation of the translated text.

<ins>Example user story:</ins>
As an international student, Roy is studying English in order to prepare for his English proficiency test. However, while studying the subject,
he came across some words or sentences he does not know how to pronounce. Using the speaker button located at the
bottom right side of text boxes, Roy can listen to the speech.

<ins>Example use case tutorial:</ins>

[Text to Speech Demo](Resources/TextToSpeechUseCase.mp4)<br><br>


## 3. Installation Instructions
This Translator Program requires installation of FreeTTS.
1. Download the latest FreeTTS zip file from https://sourceforge.net/projects/freetts/files/ .
2. Extract downloaded zip file.
3. Browse to the following path.
   * freetts-1.2.2-bin/freetts-1.2/lib/
4. Run jsapi.exe file and install freeTTS
   * For Mac users, open terminal and browse to the extracted /lib folder.
   * chmod +x ./jsapi.sh and afterwards sh ./jsapi.sh
5. Check jsapi.jar file is installed in the /lib folder.
6. Include /lib folder into the project.
   1. File -> project structure -> Project Settings -> Modules
   2. Click "+" icon, then select "1 JARs or Directories"
   3. Select the entire /lib folder.
   4. Apply then OK.

![FreeTTS Installation](Resources/FreeTTS%20Install.png)

## 4. Usage guide
1. Ensure you have Java (preferably v.11) Installed. If you do not, follow the instructions in this link:
   https://www.java.com/en/download/help/download_options.html
2. Fork and clone the repository and open it in IntelliJ.
3. If you notice that some files are underlined in red, try reloading maven.
4. Head to the README file and follow the instruction in [Installation Instructions](#3-installation-instructions)
5. Then go to the [Features of the Software](#2-features-of-the-software) section and start exploring the software
   with your features of choice.
6. Once you are done head to the [Feedback](#6-feedback) section and complete feedback form. This will help us improve
   the software!
7. You can also make a contribution if you head over to [Contributions](#7-contributions).

## 5. License
License is in the Project file.

## 6. Feedback
Users can give feedback via the Google forms link below.

We believe valid feedback is in the form of what was done well and what could be improved. Your feedback should target usability and simplicity of use, performance, presence of bugs and suggestions for new features.
Feedback allows us to collect valuable insights from users to help us enhance the functionality, usability, and overall user experience of the software.

_Guidelines for what to expect when submitting your feedback:_

Providing your feedback: Submit your feedback while considering what counts as valid feedback for us (as mentioned above). Share your experiences and areas of improvements.
How we review your feedback: Upon submitting your feedback, we will review it thoroughly. Feedback regarding bugs and issues will be addressed immediately to ensure the software works correctly for its current users. Constructive feedback will be taken into consideration during future improvements of the software.
Updates: Suggestions and fixes may take time implement so make sure you look out for updates of the software as soon as they become available.
Stay engaged: Feel free to provide your feedback at any time. Your feedback helps us improve The Translator!!

<ins>Google form link:</ins>
https://forms.gle/XRTDruZFNydroKSE9

## 7. Contributions
To contribute to this project, open an issue or submit a merge request.

To fork this project on GitHub, click the fork button in the top right of the repository.
Provide a brief description of the changes you intend on making to the project, and click the “Create Fork” button.

In your merge request, please summarize with clarity which files were modified and what files were added.
Make sure to explain why these changes were necessary.

The protocols for reviewing contributions are as follows:
Your code should have clean coding style and code correctness, include tests and state test coverage,
adhere to Clean Architecture and SOLID principles, and include javadocs that are accurate, clear, complete,
easy to use, and up to date.<br><br>
