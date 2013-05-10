<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE countries [
   <!ELEMENT countries (country)*>
   <!ELEMENT country (city*, language*)>
   <!ATTLIST country name CDATA #REQUIRED
                  population CDATA #REQUIRED
			area CDATA #REQUIRED>
   <!ELEMENT city (name, population)>
   <!ATTLIST language percentage CDATA #REQUIRED>
   <!ELEMENT name (#PCDATA)>
   <!ELEMENT population (#PCDATA)>
   <!ELEMENT language (#PCDATA)>

]>


<countries>
  <country name="Afghanistan" population="22664136" area="647500">
    <language percentage="11">Turkic</language>
    <language percentage="35">Pashtu</language>
    <language percentage="50">Afghan Persian</language>
  </country>
  <country name="Albania" population="3249136" area="28750"/>
  <country name="Algeria" population="29183032" area="2381740">
    <city>
      <name>Algiers</name>
      <population>1507241</population>
    </city>
  </country>
  <country name="American Samoa" population="59566" area="199"/>
  <country name="Andorra" population="72766" area="450"/>
  <country name="Angola" population="10342899" area="1246700"/>
  <country name="Anguilla" population="10424" area="91">
    <language percentage="100">English</language>
  </country>
  <country name="Antigua and Barbuda" population="65647" area="440">
    <language percentage="100">English</language>
  </country>
  <country name="Argentina" population="34672996" area="2766890">
    <city>
      <name>La Matanza</name>
      <population>1111811</population>
    </city>
    <city>
      <name>Cordoba</name>
      <population>1208713</population>
    </city>
    <city>
      <name>Rosario</name>
      <population>1118984</population>
    </city>
    <city>
      <name>Buenos Aires</name>
      <population>2988006</population>
    </city>
  </country>
  <country name="Armenia" population="3463574" area="29800">
    <city>
      <name>Yerevan</name>
      <population>1200000</population>
    </city>
    <language percentage="2">Russian</language>
    <language percentage="96">Armenian</language>
  </country>
  <country name="Aruba" population="67794" area="193"/>
  <country name="Australia" population="18260864" area="7686850">
    <city>
      <name>Sydney</name>
      <population>3657000</population>
    </city>
    <city>
      <name>Brisbane</name>
      <population>1302000</population>
    </city>
    <city>
      <name>Adelaide</name>
      <population>1050000</population>
    </city>
    <city>
      <name>Melbourne</name>
      <population>3081000</population>
    </city>
    <city>
      <name>Perth</name>
      <population>1193000</population>
    </city>
    <language percentage="100">English</language>
  </country>
  <country name="Austria" population="8023244" area="83850">
    <city>
      <name>Vienna</name>
      <population>1583000</population>
    </city>
    <language percentage="100">German</language>
  </country>
  <country name="Azerbaijan" population="7676953" area="86600">
    <city>
      <name>Baku</name>
      <population>1740000</population>
    </city>
    <language percentage="3">Russian</language>
    <language percentage="2">Armenian</language>
    <language percentage="89">Azeri</language>
  </country>
  <country name="Bahamas" population="259367" area="13940"/>
  <country name="Bahrain" population="590042" area="620"/>
  <country name="Bangladesh" population="123062800" area="144000">
    <city>
      <name>Dhaka</name>
      <population>3839000</population>
    </city>
    <city>
      <name>Chittagong</name>
      <population>1599000</population>
    </city>
  </country>
  <country name="Barbados" population="257030" area="430">
    <language percentage="100">English</language>
  </country>
  <country name="Belarus" population="10415973" area="207600">
    <city>
      <name>Minsk</name>
      <population>1540000</population>
    </city>
  </country>
  <country name="Belgium" population="10170241" area="30510">
    <language percentage="32">French</language>
    <language percentage="1">German</language>
    <language percentage="56">Dutch</language>
  </country>
  <country name="Belize" population="219296" area="22960"/>
  <country name="Benin" population="5709529" area="112620"/>
  <country name="Bermuda" population="62099" area="50">
    <language percentage="100">English</language>
  </country>
  <country name="Bhutan" population="1822625" area="47000"/>
  <country name="Bolivia" population="7165257" area="1098580"/>
  <country name="Bosnia and Herzegovina" population="2656240" area="51233">
    <language percentage="99">Serbo-Croatian</language>
  </country>
  <country name="Botswana" population="1477630" area="600370"/>
  <country name="Brazil" population="162661216" area="8511965">
    <city>
      <name>Manaus</name>
      <population>1158265</population>
    </city>
    <city>
      <name>Salvador</name>
      <population>2209465</population>
    </city>
    <city>
      <name>Fortaleza</name>
      <population>1967365</population>
    </city>
    <city>
      <name>Belo Horizonte</name>
      <population>2091770</population>
    </city>
    <city>
      <name>Belem</name>
      <population>1142258</population>
    </city>
    <city>
      <name>Curitiba</name>
      <population>1465698</population>
    </city>
    <city>
      <name>Recife</name>
      <population>1342877</population>
    </city>
    <city>
      <name>Rio de Janeiro</name>
      <population>5533011</population>
    </city>
    <city>
      <name>Porto Alegre</name>
      <population>1286251</population>
    </city>
    <city>
      <name>Sao Paulo</name>
      <population>9811776</population>
    </city>
    <city>
      <name>Brasilia</name>
      <population>1817001</population>
    </city>
  </country>
  <country name="British Virgin Islands" population="13195" area="150">
    <language percentage="100">English</language>
  </country>
  <country name="Brunei" population="299939" area="5770"/>
  <country name="Bulgaria" population="8612757" area="110910">
    <city>
      <name>Sofia</name>
      <population>1300000</population>
    </city>
    <language percentage="100">Bulgarian</language>
  </country>
  <country name="Burkina Faso" population="10623323" area="274200"/>
  <country name="Burma" population="45975624" area="678500">
    <city>
      <name>Rangoon</name>
      <population>2513000</population>
    </city>
    <language percentage="100">Burmese</language>
  </country>
  <country name="Burundi" population="5943057" area="27830"/>
  <country name="Cambodia" population="10861218" area="181040"/>
  <country name="Cameroon" population="14261557" area="475440"/>
  <country name="Canada" population="28820672" area="9976140">
    <city>
      <name>Montreal</name>
      <population>1017666</population>
    </city>
  </country>
  <country name="Cape Verde" population="449066" area="4030"/>
  <country name="Cayman Islands" population="34646" area="260">
    <language percentage="100">English</language>
  </country>
  <country name="Central African Republic" population="3274426" area="622980"/>
  <country name="Chad" population="6976845" area="1284000"/>
  <country name="Chile" population="14333258" area="756950">
    <city>
      <name>Santiago</name>
      <population>4318000</population>
    </city>
    <language percentage="100">Spanish</language>
  </country>
  <country name="China" population="1210004992" area="9596960">
    <city>
      <name>Hong Kong</name>
      <population>6218000</population>
    </city>
    <city>
      <name>Hefei</name>
      <population>1000000</population>
    </city>
    <city>
      <name>Huainan</name>
      <population>1200000</population>
    </city>
    <city>
      <name>Lanzhou</name>
      <population>1510000</population>
    </city>
    <city>
      <name>Guangzhou</name>
      <population>3580000</population>
    </city>
    <city>
      <name>Guiyang</name>
      <population>1530000</population>
    </city>
    <city>
      <name>Shijiazhuang</name>
      <population>1320000</population>
    </city>
    <city>
      <name>Tangshan</name>
      <population>1500000</population>
    </city>
    <city>
      <name>Handan</name>
      <population>1110000</population>
    </city>
    <city>
      <name>Harbin</name>
      <population>2830000</population>
    </city>
    <city>
      <name>Qiqihar</name>
      <population>1380000</population>
    </city>
    <city>
      <name>Zhengzhou</name>
      <population>1710000</population>
    </city>
    <city>
      <name>Luoyang</name>
      <population>1190000</population>
    </city>
    <city>
      <name>Wuhan</name>
      <population>3750000</population>
    </city>
    <city>
      <name>Changsha</name>
      <population>1330000</population>
    </city>
    <city>
      <name>Nanjing</name>
      <population>2500000</population>
    </city>
    <city>
      <name>Fuzhou</name>
      <population>1290000</population>
    </city>
    <city>
      <name>Nanchang</name>
      <population>1350000</population>
    </city>
    <city>
      <name>Jilin</name>
      <population>1270000</population>
    </city>
    <city>
      <name>Changchun</name>
      <population>2110000</population>
    </city>
    <city>
      <name>Shenyang</name>
      <population>4540000</population>
    </city>
    <city>
      <name>Dalian</name>
      <population>2400000</population>
    </city>
    <city>
      <name>Anshan</name>
      <population>1390000</population>
    </city>
    <city>
      <name>Fushun</name>
      <population>1350000</population>
    </city>
    <city>
      <name>Xian</name>
      <population>2760000</population>
    </city>
    <city>
      <name>Jinan</name>
      <population>2320000</population>
    </city>
    <city>
      <name>Zibo</name>
      <population>2460000</population>
    </city>
    <city>
      <name>Qingdao</name>
      <population>2060000</population>
    </city>
    <city>
      <name>Taiyuan</name>
      <population>1960000</population>
    </city>
    <city>
      <name>Datong</name>
      <population>1110000</population>
    </city>
    <city>
      <name>Chengdu</name>
      <population>2810000</population>
    </city>
    <city>
      <name>Chongqing</name>
      <population>2980000</population>
    </city>
    <city>
      <name>Kunming</name>
      <population>1520000</population>
    </city>
    <city>
      <name>Hangzhou</name>
      <population>1340000</population>
    </city>
    <city>
      <name>Ningbo</name>
      <population>1090000</population>
    </city>
    <city>
      <name>Nanning</name>
      <population>1070000</population>
    </city>
    <city>
      <name>Baotou</name>
      <population>1200000</population>
    </city>
    <city>
      <name>Urumqi</name>
      <population>1160000</population>
    </city>
    <city>
      <name>Beijing</name>
      <population>7000000</population>
    </city>
    <city>
      <name>Shanghai</name>
      <population>7830000</population>
    </city>
    <city>
      <name>Tianjin</name>
      <population>5770000</population>
    </city>
  </country>
  <country name="Christmas Island" population="813" area="135">
    <language percentage="100">English</language>
  </country>
  <country name="Cocos Islands" population="609" area="14">
    <language percentage="100">English</language>
  </country>
  <country name="Colombia" population="36813160" area="1138910">
    <city>
      <name>Medellin</name>
      <population>1621356</population>
    </city>
    <city>
      <name>Barranquilla</name>
      <population>1064255</population>
    </city>
    <city>
      <name>Bogota</name>
      <population>5237635</population>
    </city>
    <city>
      <name>Cali</name>
      <population>1718871</population>
    </city>
    <language percentage="100">Spanish</language>
  </country>
  <country name="Comoros" population="569237" area="2170"/>
  <country name="Congo" population="2527841" area="342000"/>
  <country name="Cook Islands" population="19561" area="240"/>
  <country name="Costa Rica" population="3463083" area="51100"/>
  <country name="Cote dIvoire" population="14762445" area="322460"/>
  <country name="Croatia" population="5004112" area="56538">
    <language percentage="96">Serbo-Croatian</language>
  </country>
  <country name="Cuba" population="10951334" area="110860">
    <city>
      <name>Havana</name>
      <population>2241000</population>
    </city>
    <language percentage="100">Spanish</language>
  </country>
  <country name="Cyprus" population="744609" area="9250"/>
  <country name="Czech Republic" population="10321120" area="78703">
    <city>
      <name>Prague</name>
      <population>1215000</population>
    </city>
  </country>
  <country name="Denmark" population="5249632" area="43070">
    <city>
      <name>Copenhagen</name>
      <population>1358540</population>
    </city>
  </country>
  <country name="Djibouti" population="427642" area="22000"/>
  <country name="Dominica" population="82926" area="750"/>
  <country name="Dominican Republic" population="8088881" area="48730">
    <city>
      <name>Santo Domingo</name>
      <population>1400000</population>
    </city>
    <language percentage="100">Spanish</language>
  </country>
  <country name="Ecuador" population="11466291" area="283560">
    <city>
      <name>Quito</name>
      <population>1200000</population>
    </city>
    <city>
      <name>Guayaquil</name>
      <population>1300868</population>
    </city>
  </country>
  <country name="Egypt" population="63575108" area="1001450">
    <city>
      <name>El Giza</name>
      <population>1671000</population>
    </city>
    <city>
      <name>Alexandria</name>
      <population>2917000</population>
    </city>
    <city>
      <name>Cairo</name>
      <population>6053000</population>
    </city>
  </country>
  <country name="El Salvador" population="5828987" area="21040"/>
  <country name="Equatorial Guinea" population="431282" area="28050"/>
  <country name="Eritrea" population="3427883" area="121320"/>
  <country name="Estonia" population="1459428" area="45100"/>
  <country name="Ethiopia" population="57171664" area="1127127">
    <city>
      <name>Addis Ababa</name>
      <population>2316400</population>
    </city>
  </country>
  <country name="Falkland Islands" population="2374" area="12170">
    <language percentage="100">English</language>
  </country>
  <country name="Faroe Islands" population="43857" area="1400"/>
  <country name="Fiji" population="782381" area="18270"/>
  <country name="Finland" population="5105230" area="337030">
    <language percentage="6.3">Swedish</language>
    <language percentage="93.5">Finnish</language>
  </country>
  <country name="France" population="58317448" area="547030">
    <city>
      <name>Paris</name>
      <population>2152423</population>
    </city>
    <language percentage="100">French</language>
  </country>
  <country name="French Guiana" population="151187" area="91000">
    <language percentage="100">French</language>
  </country>
  <country name="French Polynesia" population="224911" area="4167"/>
  <country name="Gabon" population="1172798" area="267670"/>
  <country name="Gambia" population="1204984" area="11300"/>
  <country name="Georgia" population="5219810" area="69700">
    <city>
      <name>Tbilisi</name>
      <population>1200000</population>
    </city>
    <language percentage="9">Russian</language>
    <language percentage="7">Armenian</language>
    <language percentage="6">Azeri</language>
    <language percentage="71">Georgian</language>
  </country>
  <country name="Germany" population="83536112" area="356910">
    <city>
      <name>Munchen</name>
      <population>1244676</population>
    </city>
    <city>
      <name>Muenchen</name>
      <population>1290079</population>
    </city>
    <city>
      <name>Berlin</name>
      <population>3472009</population>
    </city>
    <city>
      <name>Hamburg</name>
      <population>1705872</population>
    </city>
    <language percentage="100">German</language>
  </country>
  <country name="Ghana" population="17698272" area="238540"/>
  <country name="Gibraltar" population="28765" area="6.5"/>
  <country name="Greece" population="10538594" area="131940"/>
  <country name="Greenland" population="58203" area="2175600"/>
  <country name="Grenada" population="94961" area="340"/>
  <country name="Guadeloupe" population="407768" area="1780">
    <language percentage="99">French</language>
  </country>
  <country name="Guam" population="156974" area="541.3"/>
  <country name="Guatemala" population="11277614" area="108890">
    <language percentage="60">Spanish</language>
    <language percentage="40">Indian</language>
  </country>
  <country name="Guernsey" population="62920" area="194"/>
  <country name="Guinea" population="7411981" area="245860">
    <language percentage="100">French</language>
  </country>
  <country name="Guinea-Bissau" population="1151330" area="36120"/>
  <country name="Guyana" population="712091" area="214970"/>
  <country name="Haiti" population="6731539" area="27750">
    <language percentage="10">French</language>
  </country>
  <country name="Holy See" population="840" area="0.44"/>
  <country name="Honduras" population="5605193" area="112090"/>
  <country name="Hungary" population="10002541" area="93030">
    <city>
      <name>Budapest</name>
      <population>2016000</population>
    </city>
    <language percentage="98.2">Hungarian</language>
  </country>
  <country name="Iceland" population="270292" area="103000">
    <language percentage="100">Icelandic</language>
  </country>
  <country name="India" population="952107712" area="3287590">
    <city>
      <name>Hyderabad</name>
      <population>3145939</population>
    </city>
    <city>
      <name>Ahmadabad</name>
      <population>2954526</population>
    </city>
    <city>
      <name>Surat</name>
      <population>1505872</population>
    </city>
    <city>
      <name>Vadodara</name>
      <population>1061598</population>
    </city>
    <city>
      <name>Bangalore</name>
      <population>3302296</population>
    </city>
    <city>
      <name>Bhopal</name>
      <population>1062771</population>
    </city>
    <city>
      <name>Indore</name>
      <population>1091674</population>
    </city>
    <city>
      <name>Mumbai</name>
      <population>9925891</population>
    </city>
    <city>
      <name>Nagpur</name>
      <population>1624752</population>
    </city>
    <city>
      <name>Pune</name>
      <population>1566651</population>
    </city>
    <city>
      <name>Kalyan</name>
      <population>1014557</population>
    </city>
    <city>
      <name>Ludhiana</name>
      <population>1042740</population>
    </city>
    <city>
      <name>Jaipur</name>
      <population>1458183</population>
    </city>
    <city>
      <name>Madras</name>
      <population>3841396</population>
    </city>
    <city>
      <name>Lucknow</name>
      <population>1619115</population>
    </city>
    <city>
      <name>Kanpur</name>
      <population>1879420</population>
    </city>
    <city>
      <name>Calcutta</name>
      <population>4399819</population>
    </city>
    <city>
      <name>New Delhi</name>
      <population>7206704</population>
    </city>
    <language percentage="30">Hindi</language>
  </country>
  <country name="Indonesia" population="206611600" area="1919440">
    <city>
      <name>Jakarta</name>
      <population>8259266</population>
    </city>
    <city>
      <name>Bandung</name>
      <population>2058649</population>
    </city>
    <city>
      <name>Semarang</name>
      <population>1250971</population>
    </city>
    <city>
      <name>Surabaya</name>
      <population>2483871</population>
    </city>
    <city>
      <name>Palembang</name>
      <population>1144279</population>
    </city>
    <city>
      <name>Medan</name>
      <population>1730752</population>
    </city>
  </country>
  <country name="Iran" population="66094264" area="1648000">
    <city>
      <name>Tabriz</name>
      <population>1166203</population>
    </city>
    <city>
      <name>Esfahan</name>
      <population>1220595</population>
    </city>
    <city>
      <name>Shiraz</name>
      <population>1042801</population>
    </city>
    <city>
      <name>Mashhad</name>
      <population>1964489</population>
    </city>
    <city>
      <name>Tehran</name>
      <population>6750043</population>
    </city>
    <language percentage="1">Turkish</language>
    <language percentage="1">Baloch</language>
    <language percentage="9">Kurdish</language>
    <language percentage="1">Arabic</language>
    <language percentage="2">Luri</language>
    <language percentage="58">Persian Persian</language>
    <language percentage="26">Turkic Turkic</language>
  </country>
  <country name="Iraq" population="21422292" area="437072">
    <city>
      <name>Baghdad</name>
      <population>4478000</population>
    </city>
  </country>
  <country name="Ireland" population="3566833" area="70280"/>
  <country name="Israel" population="5421995" area="20770"/>
  <country name="Italy" population="57460272" area="301230">
    <city>
      <name>Milano</name>
      <population>1432184</population>
    </city>
    <city>
      <name>Rome</name>
      <population>2791354</population>
    </city>
    <city>
      <name>Napoli</name>
      <population>1206013</population>
    </city>
  </country>
  <country name="Jamaica" population="2595275" area="10990"/>
  <country name="Japan" population="125449704" area="377835">
    <city>
      <name>Sapporo</name>
      <population>1748000</population>
    </city>
    <city>
      <name>Tokyo</name>
      <population>7843000</population>
    </city>
    <city>
      <name>Yokohama</name>
      <population>3256000</population>
    </city>
    <city>
      <name>Kawasaki</name>
      <population>1187000</population>
    </city>
    <city>
      <name>Nagoya</name>
      <population>2108000</population>
    </city>
    <city>
      <name>Kyoto</name>
      <population>1415000</population>
    </city>
    <city>
      <name>Osaka</name>
      <population>2492000</population>
    </city>
    <city>
      <name>Kobe</name>
      <population>1388000</population>
    </city>
    <city>
      <name>Hiroshima</name>
      <population>1099000</population>
    </city>
    <city>
      <name>Fukuoka</name>
      <population>1273000</population>
    </city>
    <city>
      <name>Kita kyushu</name>
      <population>1012000</population>
    </city>
    <language percentage="100">Japanese</language>
  </country>
  <country name="Jersey" population="87848" area="117"/>
  <country name="Jordan" population="4212152" area="89213"/>
  <country name="Kazakstan" population="16916464" area="2717300">
    <city>
      <name>Almaty</name>
      <population>1172400</population>
    </city>
    <language percentage="40">Kazak</language>
  </country>
  <country name="Kenya" population="28176686" area="582650">
    <city>
      <name>Nairobi</name>
      <population>2000000</population>
    </city>
  </country>
  <country name="Kiribati" population="80919" area="717"/>
  <country name="Kuwait" population="1950047" area="17820"/>
  <country name="Kyrgyzstan" population="4529648" area="198500"/>
  <country name="Laos" population="4975772" area="236800"/>
  <country name="Latvia" population="2468982" area="64100"/>
  <country name="Lebanon" population="3776317" area="10400"/>
  <country name="Lesotho" population="1970781" area="30350"/>
  <country name="Liberia" population="2109789" area="111370">
    <language percentage="20">English</language>
  </country>
  <country name="Libya" population="5445436" area="1759540"/>
  <country name="Liechtenstein" population="31122" area="160"/>
  <country name="Lithuania" population="3646041" area="65200"/>
  <country name="Luxembourg" population="415870" area="2586"/>
  <country name="Macau" population="496837" area="16">
    <language percentage="4">Portuguese</language>
  </country>
  <country name="Macedonia" population="2104035" area="25333">
    <language percentage="21">Albanian</language>
    <language percentage="70">Macedonian</language>
    <language percentage="3">Turkish</language>
    <language percentage="3">Serbo-Croatian</language>
  </country>
  <country name="Madagascar" population="13670507" area="587040">
    <city>
      <name>Antananarivo</name>
      <population>1250000</population>
    </city>
  </country>
  <country name="Malawi" population="9452844" area="118480"/>
  <country name="Malaysia" population="19962892" area="329750">
    <city>
      <name>Kuala Lumpur</name>
      <population>1145075</population>
    </city>
  </country>
  <country name="Maldives" population="270758" area="300"/>
  <country name="Mali" population="9653261" area="1240000">
    <language percentage="80">Bambara</language>
  </country>
  <country name="Malta" population="375576" area="320"/>
  <country name="Man" population="73837" area="588"/>
  <country name="Marshall Islands" population="58363" area="181.3"/>
  <country name="Martinique" population="399151" area="1100"/>
  <country name="Mauritania" population="2336048" area="1030700"/>
  <country name="Mauritius" population="1140256" area="1860"/>
  <country name="Mayotte" population="100838" area="375"/>
  <country name="Mexico" population="95772464" area="1972550">
    <city>
      <name>Nezahualcoyotl</name>
      <population>1255456</population>
    </city>
    <city>
      <name>Guadalajara</name>
      <population>1650042</population>
    </city>
    <city>
      <name>Monterrey</name>
      <population>1068996</population>
    </city>
    <city>
      <name>Puebla</name>
      <population>1007170</population>
    </city>
    <city>
      <name>Mexico</name>
      <population>9815795</population>
    </city>
  </country>
  <country name="Micronesia" population="125377" area="702"/>
  <country name="Moldova" population="4463847" area="33700"/>
  <country name="Monaco" population="31719" area="1.9"/>
  <country name="Mongolia" population="2496617" area="1565000">
    <language percentage="90">Khalkha Mongol</language>
  </country>
  <country name="Montserrat" population="12771" area="100">
    <language percentage="100">English</language>
  </country>
  <country name="Morocco" population="29779156" area="446550">
    <city>
      <name>Rabat</name>
      <population>1385872</population>
    </city>
    <city>
      <name>Casablanca</name>
      <population>2940623</population>
    </city>
  </country>
  <country name="Mozambique" population="17877928" area="801590">
    <language percentage="100">Portuguese</language>
  </country>
  <country name="Namibia" population="1677243" area="825418">
    <language percentage="32">German</language>
    <language percentage="7">English</language>
    <language percentage="60">Afrikaans</language>
  </country>
  <country name="Nauru" population="10273" area="21"/>
  <country name="Nepal" population="22094032" area="140800">
    <language percentage="100">Nepali</language>
  </country>
  <country name="Netherlands" population="15568034" area="37330">
    <city>
      <name>Amsterdam</name>
      <population>1101407</population>
    </city>
    <city>
      <name>Rotterdam</name>
      <population>1078747</population>
    </city>
    <language percentage="100">Dutch</language>
  </country>
  <country name="Netherlands Antilles" population="208968" area="960"/>
  <country name="New Caledonia" population="187784" area="19060"/>
  <country name="New Zealand" population="3547983" area="268680"/>
  <country name="Nicaragua" population="4272352" area="129494">
    <city>
      <name>Managua</name>
      <population>1195000</population>
    </city>
    <language percentage="100">Spanish</language>
  </country>
  <country name="Niger" population="9113001" area="1267000"/>
  <country name="Nigeria" population="103912488" area="923770">
    <city>
      <name>Lagos</name>
      <population>5686000</population>
    </city>
    <city>
      <name>Ibadan</name>
      <population>1263000</population>
    </city>
  </country>
  <country name="Niue" population="2174" area="260"/>
  <country name="Norfolk Island" population="2209" area="34.6"/>
  <country name="North Korea" population="23904124" area="120540">
    <city>
      <name>Pyongyang</name>
      <population>2335000</population>
    </city>
    <language percentage="100">Korean</language>
  </country>
  <country name="Northern Mariana Islands" population="52284" area="477"/>
  <country name="Norway" population="4383807" area="324220">
    <language percentage="100">Norwegian</language>
  </country>
  <country name="Oman" population="2186548" area="212460"/>
  <country name="Pakistan" population="129275664" area="803940">
    <city>
      <name>Hyderabad</name>
      <population>1107000</population>
    </city>
    <city>
      <name>Peshawar</name>
      <population>1676000</population>
    </city>
    <city>
      <name>Lahore</name>
      <population>5085000</population>
    </city>
    <city>
      <name>Karachi</name>
      <population>9863000</population>
    </city>
    <city>
      <name>Faisalabad</name>
      <population>1875000</population>
    </city>
    <city>
      <name>Gujranwala</name>
      <population>1663000</population>
    </city>
    <city>
      <name>Rawalpindi</name>
      <population>1290000</population>
    </city>
    <city>
      <name>Multan</name>
      <population>1257000</population>
    </city>
    <language percentage="8">Pashtu</language>
    <language percentage="8">Urdu</language>
    <language percentage="48">Punjabi</language>
    <language percentage="12">Sindhi</language>
    <language percentage="3">Balochi</language>
    <language percentage="2">Hindko</language>
    <language percentage="1">Brahui</language>
    <language percentage="10">Siraiki</language>
  </country>
  <country name="Palau" population="16952" area="458"/>
  <country name="Panama" population="2655094" area="78200">
    <language percentage="14">English</language>
  </country>
  <country name="Papua New Guinea" population="4394537" area="461690">
    <language percentage="1">English</language>
  </country>
  <country name="Paraguay" population="5504146" area="406750"/>
  <country name="Peru" population="24523408" area="1285220">
    <city>
      <name>Lima</name>
      <population>6321173</population>
    </city>
  </country>
  <country name="Philippines" population="74480848" area="300000">
    <city>
      <name>Manila</name>
      <population>1655000</population>
    </city>
    <city>
      <name>Quezon</name>
      <population>1989000</population>
    </city>
    <city>
      <name>Kalookan</name>
      <population>1023000</population>
    </city>
    <city>
      <name>Davao</name>
      <population>1007000</population>
    </city>
  </country>
  <country name="Pitcairn Islands" population="56" area="47"/>
  <country name="Poland" population="38642564" area="312683">
    <city>
      <name>Warsaw</name>
      <population>1655000</population>
    </city>
    <language percentage="100">Polish</language>
  </country>
  <country name="Portugal" population="9865114" area="92080">
    <language percentage="100">Portuguese</language>
  </country>
  <country name="Puerto Rico" population="3819023" area="9104"/>
  <country name="Qatar" population="547761" area="11000"/>
  <country name="Reunion" population="679198" area="2510"/>
  <country name="Romania" population="21657162" area="237500">
    <city>
      <name>Bucharest</name>
      <population>2037000</population>
    </city>
  </country>
  <country name="Russia" population="148178480" area="17075200">
    <city>
      <name>Sankt Peterburg</name>
      <population>4838000</population>
    </city>
    <city>
      <name>Moscow</name>
      <population>8717000</population>
    </city>
    <city>
      <name>Nizhniy Novgorod</name>
      <population>1383000</population>
    </city>
    <city>
      <name>Kazan</name>
      <population>1085000</population>
    </city>
    <city>
      <name>Volgograd</name>
      <population>1003000</population>
    </city>
    <city>
      <name>Samara</name>
      <population>1184000</population>
    </city>
    <city>
      <name>Rostov na Donu</name>
      <population>1026000</population>
    </city>
    <city>
      <name>Ufa</name>
      <population>1094000</population>
    </city>
    <city>
      <name>Perm</name>
      <population>1032000</population>
    </city>
    <city>
      <name>Yekaterinburg</name>
      <population>1280000</population>
    </city>
    <city>
      <name>Chelyabinsk</name>
      <population>1086000</population>
    </city>
    <city>
      <name>Novosibirsk</name>
      <population>1369000</population>
    </city>
    <city>
      <name>Omsk</name>
      <population>1163000</population>
    </city>
    <language percentage="100">Russian</language>
  </country>
  <country name="Rwanda" population="6853359" area="26340"/>
  <country name="Saint Helena" population="6782" area="410">
    <language percentage="100">English</language>
  </country>
  <country name="Saint Kitts and Nevis" population="41369" area="269">
    <language percentage="100">English</language>
  </country>
  <country name="Saint Lucia" population="157862" area="620"/>
  <country name="Saint Pierre and Miquelon" population="6809" area="242">
    <language percentage="100">French</language>
  </country>
  <country name="Saint Vincent and the Grenadines" population="118344" area="340"/>
  <country name="San Marino" population="24521" area="60">
    <language percentage="100">Italian</language>
  </country>
  <country name="Sao Tome and Principe" population="144128" area="960">
    <language percentage="100">Portuguese</language>
  </country>
  <country name="Saudi Arabia" population="19409058" area="1960582">
    <city>
      <name>Riyadh</name>
      <population>1250000</population>
    </city>
    <language percentage="100">Arabic</language>
  </country>
  <country name="Senegal" population="9092749" area="196190">
    <city>
      <name>Dakar</name>
      <population>1382000</population>
    </city>
  </country>
  <country name="Serbia and Montenegro" population="10614558" area="102350">
    <city>
      <name>Belgrade</name>
      <population>1407073</population>
    </city>
    <language percentage="5">Albanian</language>
    <language percentage="95">Serbo-Croatian</language>
  </country>
  <country name="Seychelles" population="77575" area="455"/>
  <country name="Sierra Leone" population="4793121" area="71740"/>
  <country name="Singapore" population="3396924" area="632.6">
    <city>
      <name>Singapore</name>
      <population>2558000</population>
    </city>
  </country>
  <country name="Slovakia" population="5374362" area="48845"/>
  <country name="Slovenia" population="1951443" area="20256">
    <language percentage="91">Slovenian</language>
    <language percentage="7">Serbo-Croatian</language>
  </country>
  <country name="Solomon Islands" population="412902" area="28450">
    <language percentage="1">English</language>
  </country>
  <country name="Somalia" population="9639151" area="637660"/>
  <country name="South Africa" population="41743460" area="1219912"/>
  <country name="South Korea" population="45482292" area="98480">
    <city>
      <name>Seoul</name>
      <population>10229262</population>
    </city>
    <city>
      <name>Pusan</name>
      <population>3813814</population>
    </city>
    <city>
      <name>Taegu</name>
      <population>2449139</population>
    </city>
    <city>
      <name>Inchon</name>
      <population>2307618</population>
    </city>
    <city>
      <name>Kwangju</name>
      <population>1257504</population>
    </city>
    <city>
      <name>Taejon</name>
      <population>1272143</population>
    </city>
  </country>
  <country name="Spain" population="39181112" area="504750">
    <city>
      <name>Barcelona</name>
      <population>1630867</population>
    </city>
    <city>
      <name>Madrid</name>
      <population>3041101</population>
    </city>
    <language percentage="17">Catalan</language>
    <language percentage="7">Galician</language>
    <language percentage="2">Basque</language>
  </country>
  <country name="Sri Lanka" population="18553074" area="65610">
    <language percentage="18">Tamil</language>
    <language percentage="74">Sinhala</language>
  </country>
  <country name="Sudan" population="31547544" area="2505810">
    <city>
      <name>Omdurman</name>
      <population>1267077</population>
    </city>
  </country>
  <country name="Suriname" population="436418" area="163270"/>
  <country name="Svalbard" population="2715" area="62049"/>
  <country name="Swaziland" population="998730" area="17360"/>
  <country name="Sweden" population="8900954" area="449964">
    <language percentage="100">Swedish</language>
  </country>
  <country name="Switzerland" population="7207060" area="41290">
    <language percentage="18">French</language>
    <language percentage="65">German</language>
    <language percentage="12">Italian</language>
    <language percentage="1">Romansch</language>
  </country>
  <country name="Syria" population="15608648" area="185180">
    <city>
      <name>Damascus</name>
      <population>1500000</population>
    </city>
  </country>
  <country name="Taiwan" population="21465880" area="35980">
    <city>
      <name>Kaohsiung</name>
      <population>1426518</population>
    </city>
    <city>
      <name>Taipei</name>
      <population>2626138</population>
    </city>
  </country>
  <country name="Tajikistan" population="5916373" area="143100"/>
  <country name="Tanzania" population="29058470" area="945090">
    <city>
      <name>Dar es Salaam</name>
      <population>1360850</population>
    </city>
  </country>
  <country name="Thailand" population="58851356" area="514000">
    <city>
      <name>Bangkok</name>
      <population>5876000</population>
    </city>
  </country>
  <country name="Togo" population="4570530" area="56790"/>
  <country name="Tonga" population="106466" area="748"/>
  <country name="Trinidad and Tobago" population="1272385" area="5130"/>
  <country name="Tunisia" population="9019687" area="163610"/>
  <country name="Turkey" population="62484480" area="780580">
    <city>
      <name>Adana</name>
      <population>1047300</population>
    </city>
    <city>
      <name>Ankara</name>
      <population>2782200</population>
    </city>
    <city>
      <name>Istanbul</name>
      <population>7615500</population>
    </city>
    <city>
      <name>Izmir</name>
      <population>1985300</population>
    </city>
  </country>
  <country name="Turkmenistan" population="4149283" area="488100">
    <language percentage="12">Russian</language>
    <language percentage="9">Uzbek</language>
    <language percentage="72">Turkmen</language>
  </country>
  <country name="Turks and Caicos Islands" population="14302" area="430">
    <language percentage="100">English</language>
  </country>
  <country name="Tuvalu" population="10146" area="26"/>
  <country name="Uganda" population="20158176" area="236040"/>
  <country name="Ukraine" population="50864008" area="603700">
    <city>
      <name>Dnipropetrovsk</name>
      <population>1187000</population>
    </city>
    <city>
      <name>Donetsk</name>
      <population>1117000</population>
    </city>
    <city>
      <name>Kharkiv</name>
      <population>1618000</population>
    </city>
    <city>
      <name>Kiev</name>
      <population>2616000</population>
    </city>
    <city>
      <name>Odesa</name>
      <population>1106000</population>
    </city>
  </country>
  <country name="United Arab Emirates" population="3057337" area="75581"/>
  <country name="United Kingdom" population="58489976" area="244820">
    <city>
      <name>London</name>
      <population>6967500</population>
    </city>
    <city>
      <name>Birmingham</name>
      <population>1008400</population>
    </city>
  </country>
  <country name="United States" population="266476272" area="9372610">
    <city>
      <name>Phoenix</name>
      <population>1159014</population>
    </city>
    <city>
      <name>Los Angeles</name>
      <population>3553638</population>
    </city>
    <city>
      <name>San Diego</name>
      <population>1171121</population>
    </city>
    <city>
      <name>Chicago</name>
      <population>2721547</population>
    </city>
    <city>
      <name>Detroit</name>
      <population>1000272</population>
    </city>
    <city>
      <name>New York</name>
      <population>7380906</population>
    </city>
    <city>
      <name>Philadelphia</name>
      <population>1478002</population>
    </city>
    <city>
      <name>Houston</name>
      <population>1744058</population>
    </city>
    <city>
      <name>San Antonio</name>
      <population>1067816</population>
    </city>
    <city>
      <name>Dallas</name>
      <population>1053292</population>
    </city>
  </country>
  <country name="Uruguay" population="3238952" area="176220">
    <city>
      <name>Montevideo</name>
      <population>1247000</population>
    </city>
  </country>
  <country name="Uzbekistan" population="23418380" area="447400">
    <city>
      <name>Tashkent</name>
      <population>2106000</population>
    </city>
    <language percentage="14.2">Russian</language>
    <language percentage="4.4">Tajik</language>
    <language percentage="74.3">Uzbek</language>
  </country>
  <country name="Vanuatu" population="177504" area="14760"/>
  <country name="Venezuela" population="21983188" area="912050">
    <city>
      <name>Maracaibo</name>
      <population>1249670</population>
    </city>
    <city>
      <name>Caracas</name>
      <population>1822465</population>
    </city>
  </country>
  <country name="Vietnam" population="73976976" area="329560">
    <city>
      <name>Hanoi</name>
      <population>3056146</population>
    </city>
    <city>
      <name>Haiphong</name>
      <population>1447523</population>
    </city>
    <city>
      <name>Ho Chi Minh City</name>
      <population>3924435</population>
    </city>
  </country>
  <country name="Virgin Islands" population="97120" area="352"/>
  <country name="Wallis and Futuna" population="14659" area="274"/>
  <country name="Western Sahara" population="222631" area="266000"/>
  <country name="Western Samoa" population="214384" area="2860"/>
  <country name="Yemen" population="13483178" area="527970">
    <language percentage="100">Arabic</language>
  </country>
  <country name="Zaire" population="46498540" area="2345410">
    <city>
      <name>Kinshasa</name>
      <population>4655313</population>
    </city>
  </country>
  <country name="Zambia" population="9159072" area="752610"/>
  <country name="Zimbabwe" population="11271314" area="390580"/>
</countries>
