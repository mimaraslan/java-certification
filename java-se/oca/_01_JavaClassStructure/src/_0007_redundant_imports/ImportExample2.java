package _0007_redundant_imports;

//OKEY v1
import java.nio.file.*;

//OKEY v2
//import java.nio.file.Files; 
//import java.nio.file.Paths;

//import java.nio.*; // NO GOOD – a wildcard only matches //class names, not "file.*Files"
//import java.nio.*.*; // NO GOOD – you can only have one wildcard //and it must be at the end
//import java.nio.files.Paths.*; // NO GOOD – you cannot import methods //only class names

public class ImportExample2 {
	public void read(Files files) {
		Paths.get("name");
	}
}