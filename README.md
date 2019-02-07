# Navigation
[Binary-Encoding](#binary-encoding)
<br>
[Help](#help)
<br>
[YouTube](#my-youtube-video-click-image-to-watch)
<br>
[Quick Guide](#encoding-program-quick-guide)
<br>
[Special Thanks](#special-thanks)
<br>
<br>

# Binary-Encoding
This takes text input and converts that input into a binary string. It does not use ASCII code so it can be customized.
<br>
After getting the binary values, the program changes the binary 1's and 0's too random numbers between 0 and 9 (explained more in [Quick Guide](https://github.com/Jett50two/Binary-Encoding/blob/master/README.md#encoding-program-quick-guide)) 
<br>
<br>

# Help
For a quick reference on how the program works after downloaded the project. Check out [encoding Program Quick Guide.txt](https://github.com/Jett50two/Binary-Encoding/blob/master/src/Encoding%20Program%20Quick%20Guide.txt) (it has all the same information as the quick guide on here, just doesn't look as nice).
</br>
</br>

# My YouTube Video (Click image to watch)
[![picture alt](https://i.ytimg.com/vi/_sJW3sZ8vyM/hqdefault.jpg?sqp=-oaymwEZCNACELwBSFXyq4qpAwsIARUAAIhCGAFwAQ==&rs=AOn4CLAlRmguYshA5vZJXE2eEXzqhWVKvw)](https://www.youtube.com/watch?v=_sJW3sZ8vyM&ab_channel=Jett50two) 
<br>
<br>

# Encoding Program Quick Guide
<details>
  <summary>Concept</summary>
  <p>Set A-z to binary strings.</p>
  <p>Then use those strings as the base of the random numbers.</p>
  <p>IF 0, number should be 0 <= x <= 4</p>
  <p>IF 1, number should be 5 <= x <= 9</p>
</details>
  </p>
<details>
  <summary>Value Index</summary>
  
   Letter | Number | Binary Value
   -------|--------|-------------
   A|10|000001
   a|11|000010 
   B|12|000011 
   b|13|000100 
   C|14|000101 
   c|15|000110 
   D|16|000111 
   D|16|000111 
   d|17|001000 
   E|18|001001 
   e|19|001010 
   F|20|001011 
   f|21|001100 
   G|22|001101 
   g|23|001110 
   H|24|001111 
   h|25|010000 
   I|26|010001 
   i|27|010010 
   J|28|010011 
   j|29|010100 
   K|30|010101 
   k|31|010110 
   L|32|010111 
   l|33|011000 
   M|34|011001 
   m|35|011010 
   N|36|011011 
   n|37|011100 
   O|38|011101 
   o|39|011110 
   P|40|011111 
   p|41|100000 
   Q|42|100001 
   q|43|100010 
   R|44|100011 
   r|45|100100 
   S|46|100101 
   s|47|100110 
   T|48|100111 
   t|49|101000 
   U|50|101001 
   u|51|101010 
   V|52|101011 
   v|53|101100 
   W|54|101101 
   w|55|101110 
   X|56|101111 
   x|57|110000 
   Y|58|110001 
   y|59|110010 
   Z|60|110011 
   z|61|110100 
   0|62|110101 
   1|63|110110 
   2|64|110111 
   3|65|111000 
   4|66|111001 
   5|67|111010 
   6|68|111011 
   7|69|111100 
   8|70|111101 
   9|71|111110 
   white space|72|111111 
</details>
</p>
<details>
  <summary>Other Notes</summary>
  <p>If you want to add more values to the encoder, place a 0 to all old binary statements</p>
  <p>For example,<br>*=64 Binary = 1000000<br>that would mean that<br>A=10 Binary = 0000001 instead of 000001<br>It's one more '0'. Hard to see but could cause hours of time debugging your code.</p>
</details>
</p>
<br>
<br>

# Special Thanks
Thank you to:<br>
Sv443: <br> 
&nbsp; &nbsp; For helping me with bettering my formatting of the README.md. <br>
stefnotch: <br>
&nbsp; &nbsp; For pointing out that my code was actually encoding and not encryption. <br>
Cooly: <br>
&nbsp; &nbsp; For pointing out that I could have just used "Integer.toBinaryString(character...);" So if anybody want's to optimize the code better, use that function instead of my binary values.
