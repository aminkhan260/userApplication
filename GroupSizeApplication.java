
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class GroupSizeApplication extends Application {
	public void start(Stage primaryStage) {
		Alert output = new Alert(AlertType.INFORMATION);
		TextInputDialog dialog = new TextInputDialog();
		dialog.setContentText("Pleas Enter The Group Size: ");
		dialog.showAndWait();
		String GroupSize = dialog.getResult();
		int groupsizeint = Integer.parseInt(GroupSize);

		if (groupsizeint > 10) {
			int pplsize = groupsizeint / 2;
			output.setContentText("The number of people in this group is " + pplsize);
			output.showAndWait();

		} else if (groupsizeint >= 3 && groupsizeint <= 10) {
			int pplsize = groupsizeint / 3;
			output.setContentText("The number of people in this group is " + pplsize);
			output.showAndWait();
		} else {
			output.setContentText("The number of people has to be at least 3.");
			output.showAndWait();
		}

		dialog.setContentText("Pleas Enter The Team Size: ");
		dialog.showAndWait();
		String teamsize = dialog.getResult();
		int teamsizeint = Integer.parseInt(teamsize);

		if (teamsizeint >= 11 && teamsizeint <= 55) {
			int tmsize = teamsizeint / 11;
			output.setContentText("The number of people in this Team is " + tmsize);
			output.showAndWait();

		} else {
			output.setContentText("The Team size is 1 .");
		}
		output.showAndWait();

	}

}
