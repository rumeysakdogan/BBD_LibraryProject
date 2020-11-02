@libraryAllLogin
Feature: LibraryAllLoginCheck

  Background: user is on login page
    Given user is on library login page

  @libraryAllLogin @After
  Scenario Outline: Correct users login test
    Given user enters "<email>" and "<password>" and click login button
    #Then "<user name>" supposed to mach database data according to login credentials


    Examples:
      | user name         | email               | password |
      | Test Librarian 13 | librarian13@library | 9rf6axdD |
      | Test Librarian 14 | librarian14@library | 87x8afWY |
      | Test Librarian 15 | librarian15@library | S5Ejblg1 |
      | Test Librarian 16 | librarian16@library | 8BzUhhaU |
      | Test Librarian 17 | librarian17@library | tXqOoIOS |
      | Test Librarian 18 | librarian18@library | rKG2sP88 |
      | Test Librarian 19 | librarian19@library | 6M0J2Wr7 |
      | Test Librarian 20 | librarian20@library | XXJTMgzA |
      | Test Librarian 21 | librarian21@library | aZ849tSZ |
      | Test Librarian 22 | librarian22@library | bJRnAAyp |
      | Test Librarian 43 | librarian43@library | np6AxVIh |
      | Test Librarian 44 | librarian44@library | 4Lzovksn |
      | Test Librarian 45 | librarian45@library | KD9Wvogf |
      | Test Librarian 46 | librarian46@library | YiDR3nCQ |
      | Test Librarian 47 | librarian47@library | rJEIrUIt |
      | Test Librarian 48 | librarian48@library | LB8QnOmU |
      | Test Librarian 49 | librarian49@library | xHdfRYuD |
      | Test Librarian 50 | librarian50@library | kAbC7Ybl |
      | Test Librarian 51 | librarian51@library | dBq7G87s |
      | Test Librarian 52 | librarian52@library | QKjmEIhB |
      | Test Librarian 53 | librarian53@library | hiuBZVhh |
      | Test Librarian 54 | librarian57@library | pv2TGXSL |
      | Test Librarian 58 | librarian58@library | zrvtRQVi |
      | Test Librarian 59 | librarian59@library | whWTPjtn |
      | Test Librarian 60 | librarian60@library | OoNKtPqP |
      | Test Librarian 61 | librarian61@library | mabeKv1k |
      | Test Librarian 62 | librarian62@library | DdZ8SHvz |
      | Test Librarian 62 | librarian62@library | DdZ8SHvz |
      | Test Student 11   | student11@library   | tScBPCUr |
      | Test Student 12   | student12@library   | UC0LC9Hj |
      | Test Student 13   | student13@library   | zcVbvUWH |
      | Test Student 14   | student14@library   | 6SW236ia |
      | Test Student 15   | student15@library   | Tt6UFxnY |
      | Test Student 16   | student16@library   | VNKw282v |
      | Test Student 17   | student17@library   | 0UID4kr8 |
      | Test Student 18   | student18@library   | nK83Q8Be |
      | Test Student 19   | student19@library   | Zxzbt6nX |
      | Test Student 20   | student20@library   | KH8sN9WC |
      | Test Student 21   | student21@library   | GapVdtca |
      | Test Student 22   | student22@library   | us2rddSF |
      | Test Student 23   | student23@library   | WCeRjitW |
      | Test Student 24   | student24@library   | ya2nTtvY |
      | Test Student 25   | student25@library   | kV4feS7y |
      | Test Student 26   | student26@library   | JTvaF3br |
      | Test Student 27   | student27@library   | kkMksO2i |
      | Test Student 28   | student28@library   | 19Ceq2sT |
      | Test Student 29   | student29@library   | WyIUNpDI |
      | Test Student 30   | student30@library   | IaT9YI0I |
      | Test Student 31   | student31@library   | yOPdSR0u |
      | Test Student 32   | student32@library   | GYLemAba |
      | Test Student 33   | student33@library   | a1aI3VDj |
      | Test Student 34   | student34@library   | eEQDhR9C |
      | Test Student 35   | student35@library   | TNb5zpGn |
      | Test Student 36   | student36@library   | qR3brbb1 |
      | Test Student 37   | student37@library   | GpaUyXJQ |
      | Test Student 38   | student38@library   | r3sqckHs |
      | Test Student 39   | student39@library   | GCTOZ0Yk |
      | Test Student 40   | student40@library   | sK7ctVOS |
      | Test Student 41   | student41@library   | MhQEHwP8 |
      | Test Student 42   | student42@library   | zCm83mcJ |
      | Test Student 43   | student43@library   | 7F1rV4W8 |
      | Test Student 44   | student44@library   | BIXPElK5 |
      | Test Student 45   | student45@library   | icZMeCFc |
      | Test Student 46   | student46@library   | acFlaQ97 |
      | Test Student 47   | student47@library   | MaRKFmC4 |
      | Test Student 48   | student48@library   | xjapSRzD |
      | Test Student 49   | student49@library   | vrzPbUIK |
      | Test Student 50   | student50@library   | doN2rYs3 |
      | Test Student 51   | student51@library   | Hab4pCHI |
      | Test Student 52   | student52@library   | l43OOwss |
      | Test Student 53   | student53@library   | LZdIkogy |
      | Test Student 54   | student54@library   | 3nHQlWhN |
      | Test Student 55   | student55@library   | 8TPM4JKJ |
      | Test Student 56   | student56@library   | 4dJYzMiG |
      | Test Student 57   | student57@library   | y2xiOfwK |
      | Test Student 58   | student58@library   | o3imcY1J |
      | Test Student 59   | student59@library   | MMxtSJFr |
      | Test Student 60   | student60@library   | G7IFdJ11 |
      | Test Student 61   | student61@library   | zKAVDdXW |
      | Test Student 62   | student62@library   | KbybTpIZ |
      | Test Student 63   | student63@library   | Jg2orVoF |
      | Test Student 64   | student64@library   | pbdQAvkN |
      | Test Student 65   | student65@library   | ZiA3SOPl |
      | Test Student 66   | student66@library   | Ys9e3SFW |
      | Test Student 67   | student67@library   | X2ZxrM3u |
      | Test Student 68   | student68@library   | TVyF30uz |
      | Test Student 69   | student69@library   | gk9RIiC1 |
      | Test Student 70   | student70@library   | FPEDLRY3 |
      | Test Student 91   | student91@library   | c4vlSAqZ |
      | Test Student 92   | student92@library   | 7kPVRH29 |
      | Test Student 93   | student93@library   | QU5745l5 |
      | Test Student 94   | student94@library   | KccVOoLA |
      | Test Student 95   | student95@library   | Vu2BiIwB |
      | Test Student 96   | student96@library   | HvGl6Nsy |
      | Test Student 97   | student97@library   | 0SYBJB3A |
      | Test Student 98   | student98@library   | A15Oposz |
      | Test Student 99   | student99@library   | 8tIDMH5x |
      | Test Student 100  | student100@library  | CUcGL8fe |
      | Test Student 101  | student101@library  | Vg05pTjo |
      | Test Student 102  | student102@library  | Aaf6GwsY |
      | Test Student 103  | student103@library  | 7zWoKREA |
      | Test Student 104  | student104@library  | 73ndoZd0 |
      | Test Student 105  | student105@library  | vrBNVihU |
      | Test Student 106  | student106@library  | Yerj6ZHm |
      | Test Student 107  | student107@library  | zZr8iI13 |
      | Test Student 108  | student108@library  | uFg5d3nH |
      | Test Student 109  | student109@library  | m7tmmo6t |
      | Test Student 110  | student110@library  | iiiFoMWx |