# String Formatting 

## Structure used in String formatting 
```
"%[argument_index$][flags][width][.precision]conversion character", arguments
```
> Note the conversion character indicates the type being converted and can be seen in the table in the command section.

## Commands  
* `System.out.printf("format String", args);` 
* `System.out.format("format String", args);` 
* `String.format("format String", args);`

| Syntax | Type|
|---|---|
| %d | whole number; i.e. int, long, short, byte |
| %f | decimal number; i.e. double, float |
| %e | decimal number in scientific notation; i.e. double, float|
| %s | String or other Java object |
| %b | boolean |
| %c | char |
| %n | newline |


| Flags | Note, flags will be specified between the % and character in most cases or after the argument number where specified.||
|-------|----------|---|
| - | left justify | specify a width `"%-8dEXAMPLE", 40` => 40      EXAMPLE 
| 0 | pad numbers with zeros|`"%08dEXAMPLE", 40` => 00000040EXAMPLE |
| , | format number with commas |  `"%,8dEXAMPLE", 40000` => 40,000EXAMPLE|
| .somenumber | format number of decimals |  `"%8.2fEXAMPLE", 4.23456` =>    4.23EXAMPLE|
| + | use plus sign with positive numbers and minus sign with negative numbers |`"%+8.2fEXAMPLE", 4.23456` =>    4.23EXAMPLE|