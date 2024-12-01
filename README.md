# The Translator
# Team Names and GitHub Usernames:
Julia Zaki / julia-zaki

Christina Huang / HChristinaH

Edan Wong / 903Edan

Manjun Zhu / Karrrrmen

Mingyu (Roy) Son / SonM12

# Installation Instructions
This Translator Program requires installation of FreeTTS.
1. Download FreeTTS zip file from https://sourceforge.net/projects/freetts/files/ .
2. Extract downloaded zip file.
3. Browse to the following path.
   * freetts-1.2.2-bin/freetts-1.2/lib/
4. Run jsapi.exe file and install freeTTS
    * For Mac users, open terminal and browse to the extracted /lib folder.
    * chmod +x ./jsapi.sh and afterwards sh ./jsapi
5. Check jsapi.jar file is installed in the /lib folder.
6. Include /lib folder into the project.
   1. File -> project structure -> Project Settings -> Modules
   2. Click "+" icon, then select "1 JARs or Directories"
   3. Select the entire /lib folder.
   4. Apply then OK.

![FreeTTS Installation](Images/FreeTTS%20Install.png)


# Main View Sketch
![Main View](Images/Main%20View.jpg)

# User Stories
# 1.
Julia is learning French and is using the translator to help her translate words from English to French or vice versa.
She uses the vocabulary feature where she can choose to store a certain word and its translation in a page called
“Vocabulary”. She can access the page at any time allowing her to revise or recall the words to advance her learning
process. The process is: Julia will click on the vocabulary page and manually input in both languages (view shown below)
[Julia Zaki’s User Story]
Potential API: Filebase

![Vocabulary View](Images/Vocabulary%20View.jpg)

# 2.
Christina is studying abroad in Japan and sees a sign at a subway. She is not very familiar with Japanese.
She is in a rush and cannot easily type in the characters into her translation app so she uses the convert image
to text feature to take a picture and translate the sign.
[Christina Huang’s User Story]
API: OCR Space

# 3.
Edan is currently enrolled in a Korean learning course and several course materials are distributed in different
format of files. He wants those text in the files to be translated directly into his mother language so that he
does not have to copy and paste the text from the file into the translator. Therefore, he uses the
translate-file feature to translate the materials in an efficient way.
[Edan’s story]
Potential API: document translation API

![TranslateFile View](Images/TranslateFile%20View.jpg)

# 4.
Karmen is taking a history class and needs to watch a documentary in a foreign language. 
To fully understand the documentary, she wants to translate its script into a language she’s comfortable with. 
Using the "Translate Video" feature, Karmen gains a deeper understanding of the documentary.
[Karmen Zhu’s User Story]
Potential API: YouTube

![TranslateVideo View.jpg](Images/TranslateVideo%20View.jpg)

# 5.
Roy is studying French in order to prepare for his French proficiency test.
However, while studying the subject, he came across some words or sentences he does not know how to pronounce.
Using the speaker button located at the bottom right side of text boxes, Roy can listen to the inputted pronounciation.
[Roy Son's User Story]
Potential API: Google Translate

![TextToSpeech.jpg](Images/TextToSpeech.jpg)