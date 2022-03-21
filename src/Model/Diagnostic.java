package Model;

public class Diagnostic {
private String Disease; // if it has a disease, name it
private String DateOfResult; // date of the result


// constructor by default
public Diagnostic() {
	
	
}

public Diagnostic(String disease, String dateOfResult) {

	Disease = disease;
	DateOfResult = dateOfResult;
}
public String getDisease() {
	return Disease;
}
public void setDisease(String disease) {
	Disease = disease;
}
public String getDateOfResult() {
	return DateOfResult;
}
public void setDateOfResult(String dateOfResult) {
	DateOfResult = dateOfResult;
}
@Override
public String toString() {
	return "\nDiagnostic [Disease=" + Disease + ", Date Of the Result=" + DateOfResult + "]";
}


}
