<?xml version="1.0" ?>

<!DOCTYPE Course_Catalog [
<!ELEMENT Chair ( Professor ) >
<!ELEMENT Course ( Description | Instructors | Prerequisites | Title )* >
<!ATTLIST Course Number ID #REQUIRED 
                                     Enrollment  CDATA  #IMPLIED>
<!ELEMENT Course_Catalog ( Department+ ) >
<!ELEMENT Department ( Title, Chair, Course+ ) >
<!ATTLIST Department Code NMTOKEN #REQUIRED >
<!ELEMENT Description ( #PCDATA ) >
<!ELEMENT First_Name ( #PCDATA ) >
<!ELEMENT Instructors ( Lecturer | Professor )* >
<!ELEMENT Last_Name ( #PCDATA ) >
<!ELEMENT Lecturer ( First_Name | Last_Name | Middle_Initial )* >
<!ELEMENT Middle_Initial ( #PCDATA ) >
<!ELEMENT Prereq ( #PCDATA ) >
<!ELEMENT Prerequisites ( Prereq+ ) >
<!ELEMENT Professor ( First_Name | Last_Name | Middle_Initial )* >
<!ELEMENT Title ( #PCDATA ) >
]>

<Course_Catalog>

  <Department Code="CS">
    
    <Title>Computer Science</Title>
    
    <Chair>
      <Professor>
        <First_Name>Jennifer</First_Name>
        <Last_Name>Widom</Last_Name>
      </Professor>
    </Chair>

    <Course Number="CS106A" Enrollment="1070">
      <Title>Programming Methodology</Title>
      <Description>Introduction to the engineering of computer applications emphasizing modern software engineering principles.</Description>
      <Instructors>
        <Lecturer>
          <First_Name>Jerry</First_Name>
          <Middle_Initial>R.</Middle_Initial>
          <Last_Name>Cain</Last_Name>
        </Lecturer>
        <Professor>
          <First_Name>Eric</First_Name>
          <Last_Name>Roberts</Last_Name>
        </Professor>
        <Professor>
          <First_Name>Mehran</First_Name>
          <Last_Name>Sahami</Last_Name>
        </Professor>
      </Instructors>
    </Course>
    
    <Course Number="CS106B" Enrollment="620">
      <Title>Programming Abstractions</Title>
      <Description>Abstraction and its relation to programming.</Description>
      <Instructors>
        <Professor>
          <First_Name>Eric</First_Name>
          <Last_Name>Roberts</Last_Name>
        </Professor>
        <Lecturer>
          <First_Name>Jerry</First_Name>
          <Middle_Initial>R.</Middle_Initial>
          <Last_Name>Cain</Last_Name>
        </Lecturer>
      </Instructors>
      <Prerequisites>
        <Prereq>CS106A</Prereq>
      </Prerequisites>
    </Course>
    
    <Course Number="CS107" Enrollment="500">
      <Title>Computer Organization and Systems</Title>
      <Description>Introduction to the fundamental concepts of computer systems.</Description>
      <Instructors>
        <Lecturer>
          <First_Name>Julie</First_Name>
          <Last_Name>Zelenski</Last_Name>
        </Lecturer>
      </Instructors>
      <Prerequisites>
        <Prereq>CS106B</Prereq>
      </Prerequisites>
    </Course>    
  
    <Course Number="CS109" Enrollment="280">
      <Title>Introduction to Probability for Computer Scientists</Title>
      <Instructors>
        <Professor>
          <First_Name>Mehran</First_Name>
          <Last_Name>Sahami</Last_Name>
        </Professor>
      </Instructors>
      <Prerequisites>
        <Prereq>CS106B</Prereq>
      </Prerequisites>      
    </Course>

    <Course Number="CS124" Enrollment="60">
      <Title>From Languages to Information</Title>
      <Description>Natural language processing. Cross-listed as LING180.</Description>
      <Instructors>
        <Professor>
          <First_Name>Dan</First_Name>
          <Last_Name>Jurafsky</Last_Name>    
        </Professor>
      </Instructors>
      <Prerequisites>
        <Prereq>CS107</Prereq>
        <Prereq>CS109</Prereq>
      </Prerequisites>   
    </Course>

    <Course Number="CS143" Enrollment="90">
      <Title>Compilers</Title>
      <Description>Principles and practices for design and implementation of compilers and interpreters.</Description>
      <Instructors>
        <Professor>
          <First_Name>Alex</First_Name>
          <Middle_Initial>S.</Middle_Initial>
          <Last_Name>Aiken</Last_Name>    
        </Professor>
      </Instructors>
      <Prerequisites>
        <Prereq>CS107</Prereq>
      </Prerequisites>   
    </Course>
    
    <Course Number="CS145" Enrollment="130">
      <Title>Introduction to Databases</Title>
      <Description>Database design and use of database management systems for applications.</Description>
      <Instructors>
        <Professor>
          <First_Name>Jennifer</First_Name>
          <Last_Name>Widom</Last_Name>    
        </Professor>
      </Instructors>
      <Prerequisites>
        <Prereq>CS107</Prereq>
      </Prerequisites>  
    </Course>

    <Course Number="CS221" Enrollment="180">
      <Title>Artificial Intelligence: Principles and Techniques</Title>
      <Instructors>
        <Professor>
          <First_Name>Andrew</First_Name>
          <Last_Name>Ng</Last_Name>    
        </Professor>
        <Professor>
          <First_Name>Sebastian</First_Name>
          <Last_Name>Thrun</Last_Name>    
        </Professor>        
      </Instructors>
    </Course>
    
    <Course Number="CS228" Enrollment="110">
      <Title>Structured Probabilistic Models: Principles and Techniques</Title>
      <Description>Using probabilistic modeling languages to represent complex domains.</Description>
      <Instructors>
        <Professor>
          <First_Name>Daphne</First_Name>
          <Last_Name>Koller</Last_Name>    
        </Professor>
      </Instructors>
    </Course>

    <Course Number="CS229" Enrollment="320">
      <Title>Machine Learning</Title>
      <Description>A broad introduction to machine learning and statistical pattern recognition.</Description>
      <Instructors>
        <Professor>
          <First_Name>Andrew</First_Name>
          <Last_Name>Ng</Last_Name>    
        </Professor>
      </Instructors>
    </Course>

  </Department>

  <Department Code="EE">
  
    <Title>Electrical Engineering</Title>
    
    <Chair>
      <Professor>
        <First_Name>Mark</First_Name>
        <Middle_Initial>A.</Middle_Initial>
        <Last_Name>Horowitz</Last_Name>
      </Professor>    
    </Chair>
  
    <Course Number="EE108A">
      <Title>Digital Systems I</Title>
      <Description>Digital circuit, logic, and system design.</Description>
      <Instructors>
        <Professor>
          <First_Name>Subhasish</First_Name>
          <Last_Name>Mitra</Last_Name>
        </Professor>
      </Instructors>
    </Course>
    
    <Course Number="EE108B">
      <Title>Digital Systems II</Title>
      <Description>The design of processor-based digital systems.</Description>
      <Instructors>
        <Professor>
          <First_Name>William</First_Name>
          <Middle_Initial>J.</Middle_Initial>
          <Last_Name>Dally</Last_Name>
        </Professor>      
        <Professor>
          <First_Name>Oyekunle</First_Name>
          <Last_Name>Olukotun</Last_Name>
        </Professor>
      </Instructors>
      <Prerequisites>
        <Prereq>EE108A</Prereq>
        <Prereq>CS106B</Prereq>
      </Prerequisites>
    </Course>    
  
  </Department>

  <Department Code="LING">
  
    <Title>Linguistics</Title>
    
    <Chair>    
      <Professor>
        <First_Name>Beth</First_Name>
        <Last_Name>Levin</Last_Name>    
      </Professor>
    </Chair>

    <Course Number="LING180" Enrollment="60">
      <Title>From Languages to Information</Title>
      <Description>Natural language processing. Cross-listed as CS124.</Description>
      <Instructors>
        <Professor>
          <First_Name>Dan</First_Name>
          <Last_Name>Jurafsky</Last_Name>    
        </Professor>
      </Instructors>
      <Prerequisites>
        <Prereq>CS107</Prereq>
        <Prereq>CS109</Prereq>
      </Prerequisites>   
    </Course>
    
  </Department>
  
</Course_Catalog>