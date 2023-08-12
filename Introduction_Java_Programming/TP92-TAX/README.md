 Computing Taxes
You can use nested if statements to write a program for computing taxes.
 The U.S. federal personal income tax is calculated based on filing status and taxable income. 
There are four filing statuses: single filers, married filing jointly or qualified widow(er), married filing separately, and head of household. The tax rates vary every year. Table 3.2 shows 
the rates for 2009. If you are single with a taxable income of $10,000, for example, the first 
$8,350 is taxed at 10% and the other $1,650 is taxed at 15%, so your total tax is $1,082.50.

Table 3.2 2009 U.S. Federal Personal Tax Rates

|Marginal Tax Rate |Single|Married Filing Jointly or Married Filing Separately|Head of Household|
                              Qualifying Widow(er)
-------------------------------------------------------------------------------------------------------------------
  10%            $0–$8,350                   $0–$16,700                      $0–$8,350                $0–$11,950
  15%           $8,351–$33,950             $16,701–$67,900                  $8,351–$33,950          $11,951–$45,500
  25%           $33,951–$82,250           $67,901–$137,050                 $33,951–$68,525         $45,501–$117,450
  28%           $82,251–$171,550          $137,051–$208,850                $68,526–$104,425        $117,451–$190,200
  33%           $171,551–$372,950         $208,851–$372,950                $104,426–$186,475       $190,201–$372,950
  35%               +372,951+                 +372,951+                         +186,476+              +372,951+

  You are to write a program to compute personal income tax. Your program should prompt the 
user to enter the filing status and taxable income and compute the tax. Enter 0 for single filers, 1
for married filing jointly or qualified widow(er), 2 for married filing separately, and 3 for head 
of household.
Your program computes the tax for the taxable income based on the filing status. The filing status can be determined using if statements outlined as follows:
if (status == 0) {
 // Compute tax for single filers
}
else if (status == 1) {
 // Compute tax for married filing jointly or qualifying widow(er)
}
else if (status == 2) {
 // Compute tax for married filing separately
}
else if (status == 3) {
 // Compute tax for head of household
}
else {
 // Display wrong status
}
For each filing status there are six tax rates. Each rate is applied to a certain amount of taxable income. For example, of a taxable income of $400,000 for single filers, $8,350 is taxed 
at 10%, (33,950 - 8,350) at 15%, (82,250 - 33,950) at 25%, (171,550 - 82,250) at 28%, 
(372,950 - 171,550) at 33%, and (400,000 - 372,950) at 35%.
Listing 3.5 gives the solution for computing taxes for single filers. The complete solution 
is left as an exercise.
