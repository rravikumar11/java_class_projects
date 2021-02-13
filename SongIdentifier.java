package songidentifier;
import java.util.Scanner;

public class SongIdentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String delimiter = " ";
		String word = "";
		String prev = "";
		boolean wordequal = false;
		int[] songs = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
		String rudolphsplit = "you know dasher and dancer and prancer and vixen comet and cupid and donder and blitzen but do you recall the most famous reindeer of all rudolph the red-nosed reindeer had a very shiny nose and if you ever saw it you would even say it glows all of the other reindeer used to laugh and call him names they never let poor rudolph play in any reindeer games then one foggy christmas eve santa came to say rudolph with your nose so bright won't you guide my sleigh tonight then all the reindeer loved him as they shouted out with glee rudolph the red-nosed reindeer you'll go down in history";
		String[] rudolph = rudolphsplit.split(delimiter);
		int rudolphlength = rudolph.length;
		String hipposplit = "i want a hippopotamus for christmas only a hippopotamus will do don't want a doll no dinky tinker toy i want a hippopotamus to play with and enjoy  i want a hippopotamus for christmas i don't think santa claus will mind do you he won't have to use a dirty chimney flue just bring him through the front door that's the easy thing to do  i can see me now on christmas morning creeping down the stairs oh what joy and what surprise when i open up my eyes to see a hippo hero standing there  i want a hippopotamus for christmas only a hippopotamus will do no crocodiles no rhinoceroses i only like hippopotamuses and hippopotamuses like me too mom says a hippo would eat me up but then teacher says a hippo is a vegetarian  there's lots of room for him in our two car garage i'd feed him there and wash him there and give him his massage  i can see me now on christmas morning creeping down the stairs oh what joy and what surprise when i open up my eyes to see a hippo hero standing there  i want a hippopotamus for christmas only a hippopotamus will do no crocodiles or rhinoceroses-es i only like hippopotamuses-es and hippopotamuses like me too";
		String[] hippo = hipposplit.split(delimiter);
		int hippolength = hippo.length;
		String twelvesplit = "on the first day of christmas my true love sent to me a partridge in a pear tree on the second day of christmas my true love sent to me two turtle doves and a partridge in a pear tree on the third day of christmas my true love sent to me three french hens two turtle doves and a partridge in a pear tree on the fourth day of christmas my true love sent to me four calling birds three french hens two turtle doves and a partridge in a pear tree on the fifth day of christmas my true love sent to me five golden rings four calling birds three french hens two turtle doves and a partridge in a pear tree on the sixth day of christmas my true love sent to me six geese a-laying five golden rings four calling birds three french hens two turtle doves and a partridge in a pear tree on the seventh day of christmas my true love sent to me seven swans a-swimming six geese a-laying five golden rings four calling birds three french hens two turtle doves and a partridge in a pear tree on the eighth day of christmas my true love sent to me eight maids a-milking seven swans a-swimming six geese a-laying five golden rings four calling birds three french hens two turtle doves and a partridge in a pear tree on the ninth day of christmas my true love sent to me nine ladies dancing eight maids a-milking seven swans a-swimming six geese a-laying five golden rings four calling birds three french hens two turtle doves and a partridge in a pear tree on the tenth day of christmas my true love sent to me ten lords a-leaping nine ladies dancing eight maids a-milking seven swans a-swimming six geese a-laying five golden rings four calling birds three french hens two turtle doves and a partridge in a pear tree on the eleventh day of christmas my true love sent to me eleven pipers piping ten lords a-leaping nine ladies dancing eight maids a-milking seven swans a-swimming six geese a-laying five golden rings four calling birds three french hens two turtle doves and a partridge in a pear tree on the twelfth day of christmas my true love sent to me twelve drummers drumming eleven pipers piping ten lords a-leaping nine ladies dancing eight maids a-milking seven swans a-swimming six geese a-laying five golden rings four calling birds three french hens two turtle doves and a partridge in a pear tree";
		String[] twelve = twelvesplit.split(delimiter);
		int twelvelength = twelve.length;
		String jinglesplit = "dashing through the snow in a one-horse open sleigh o'er the fields we go laughing all the way bells on bobtail ring' making spirits bright what fun it is to ride and sing a sleighing song tonight  jingle bells jingle bells jingle all the way oh what fun it is to ride in a one-horse open sleigh jingle bells jingle bells jingle all the way oh what fun it is to ride in a one-horse open sleigh  a day or two ago i thought i'd take a ride and soon miss fanny bright was seated by my side the horse was lean and lank misfortune seemed his lot he got into a drifted bank and then we got upsot  a day or two ago the story i must tell i went out on the snow and on my back i fell a gent was riding by in a one-horse open sleigh he laughed as there i sprawling lie but quickly drove away  now the ground is white go it while you're young take the girls tonight and sing this sleighing song just get a bobtailed bay two forty as his speed hitch him to an open sleigh and crack you'll take the lead";
		String[] jingle = jinglesplit.split(delimiter);
		int jinglelength = jingle.length;
		String decksplit = "deck the halls with boughs of holly fa la la la la la la la  'tis the season to be jolly fa la la la la la la la don we now our gay apparel fa la la la la la la la troll the ancient yuletide carol fa la la la la la la la  see the blazing yule before us fa la la la la la la la strike the harp and join the chorus fa la la la la la la la  follow me in merry measure fa la la la la la la la while i tell of yuletide treasure fa la la la la la la la  fast away the old year passes fa la la la la la la la hail the new ye lads and lasses fa la la la la la la la sing we joyous all together fa la la la la la la la heedless of the wind and weather fa la la la la la la la";
		String[] deck = decksplit.split(delimiter);
		int decklength = deck.length;
		String frostysplit = "frosty the snowman was a jolly happy soul with a corncob pipe and a button nose and two eyes made out of coal frosty the snowman is a fairy tale they say he was made of snow but the children know how he came to life one day there must have been some magic in that old silk hat they found for when they placed it on his head he began to dance around o frosty the snowman was alive as he could be and the children say he could laugh and play just the same as you and me thumpetty thump thump thumpety thump thump look at frosty go thumpetty thump thump thumpety thump thump over the hills of snow  frosty the snowman knew the sun was hot that day so he said let's run and we'll have some fun now before i melt away down to the village with a broomstick in his hand running here and there all around the square saying catch me if you can he led them down the streets of town right to the traffic cop and he only paused a moment when he heard him holler stop for frosty the snow man had to hurry on his way but he waved goodbye saying don't you cry i'll be back again some day thumpetty thump thump thumpety thump thump look at frosty go thumpetty thump thump thumpety thump thump over the hills of snow";
		String[] frosty = frostysplit.split(delimiter);
		int frostylength = frosty.length;
		String silentsplit = "silent night holy night all is calm all is bright round yon virgin mother and child holy infant so tender and mild sleep in heavenly peace sleep in heavenly peace silent night holy night shepherds quake at the sight glories stream from heaven afar heavenly hosts sing alleluia christ the savior is born christ the savior is born silent night holy night son of god love's pure light radiant beams from thy holy face with the dawn of redeeming grace jesus lord at thy birth jesus lord at thy birth";
		String[] silent = silentsplit.split(delimiter);
		int silentlength = silent.length;
		String totownsplit = "you better watch out you better not cry you better not pout i'm telling you why santa claus is coming to town santa claus is coming to town santa claus is coming to town  he's making a list checking it twice gonna find out who's naughty or nice santa claus is coming to town santa claus is coming to town santa claus is coming to town  he sees you when you're sleeping he knows when you're awake he knows if you've been bad or good so be good for goodness sake  with little tin horns and little toy drums rooty toot toots and rummy tum tums santa claus is coming to town santa claus is coming to town santa claus is coming to town  he sees you when you're sleeping he knows when you're awake he knows if you've been bad or good so be good for goodness sake goodness sake  you better watch out you better not cry you better not pout i'm telling you why santa claus is coming to town santa claus is coming to town santa claus is coming santa claus is coming santa claus is coming to town ";
		String[] totown = totownsplit.split(delimiter);
		int totownlength = totown.length;
		int i = 0;
		int max = 10;
		int highest = 0;
		boolean trigger = true;
		while (trigger) {
			System.out.print("Enter a lyric: ");
			word = scan.nextLine();
			i = 0;
			wordequal = false;
			while (i < rudolphlength) {
				if (word.equals(rudolph[i]) && !word.equals(prev)) {
					songs[0]++;
					prev = word;
					wordequal = true;
				}
				i++;
			}
			prev = "";
			i = 0;
			while (i < hippolength) {
				if (word.equals(hippo[i]) && !word.equals(prev)) {
					songs[1]++;
					prev = word;
					wordequal = true;
				}
				i++;
			}
			prev = "";
			i = 0;
			while (i < twelvelength) {
				if (word.equals(twelve[i]) && !word.equals(prev)) {
					songs[2]++;
					prev = word;
					wordequal = true;
				}
				i++;
			}
			prev = "";
			i = 0;
			while (i < jinglelength) {
				if (word.equals(jingle[i]) && !word.equals(prev)) {
					songs[3]++;
					prev = word;
					wordequal = true;
				}
				i++;
			}
			prev = "";
			i = 0;
			while (i < decklength) {
				if (word.equals(deck[i]) && !word.equals(prev)) {
					songs[4]++;
					prev = word;
					wordequal = true;
				}
				i++;
			}
			prev = "";
			i = 0;
			while (i < frostylength) {
				if (word.equals(frosty[i]) && !word.equals(prev)) {
					songs[5]++;
					prev = word;
					wordequal = true;
				}
				i++;
			}
			prev = "";
			i = 0;
			while (i < silentlength) {
				if (word.equals(silent[i]) && !word.equals(prev)) {
					songs[6]++;
					prev = word;
					wordequal = true;
				}
				i++;
			}
			prev = "";
			i = 0;
			while (i < totownlength) {
				if (word.equals(totown[i]) && !word.equals(prev)) {
					songs[7]++;
					prev = word;
					wordequal = true;
				}
				i++;
			}
			i = 0;
			while (i < songs.length) {
				if (songs[i] > highest) {
					highest = songs[i];
					max = i;
				}
				i++;
			}
			i = 0;
			trigger = false;
			while (i < songs.length) {
				if (i == max) {}
				else if (highest <= songs[i]) {
					trigger = true;
				}
				i++;
			}
			if (!wordequal) {
				System.out.println("Try a word that's actually in one of these songs, genius.");
			}
		}
		//System.out.println("Song index: " + max);
		if (max == 0) {
			System.out.println("Rudolph the Red-Nosed Reindeer");
		}
		else if (max == 1) {
			System.out.println("I Want a Hippopotamus for Christmas");
		}
		else if (max == 2) {
			System.out.println("The Twelve Days of Christmas");
		}
		else if (max == 3) {
			System.out.println("Jingle Bells");
		}
		else if (max == 4) {
			System.out.println("Deck the Halls");
		}
		else if (max == 5) {
			System.out.println("Frosty the Snowman");
		}
		else if (max == 6) {
			System.out.println("Silent Night");
		}
		else if (max == 7) {
			System.out.println("Santa Claus is Comin' To Town");
		}
		else {
			System.out.println("Something has gone horribly wrong.");
		}
	}

}