#include <iostream>

using namespace std;
char shipsNew[4][4] = {
      { 'x', 'x', 'x', 'x' },
      { 'x', 'x', 'x', 'x' },
      { 'x', 'x', 'x', 'x' },
      { 'x', 'x', 'x', 'x' }
};

void drawTheBattlefield(int userRow, int userColumn) {
    system("cls");

    //Display the battlefield
    cout << "---++++++++==================++++++++---\n";

    for (int i = 0; i <= userRow; i++) {
        if (i == 0) {
            cout << "Row/Col ";
        }
        else  cout << "Line " << i << "\t";
        for (int j = 0; j < userColumn; j++) {
            if (i == 0) {
                while (j < userColumn) {
                    cout << " \t" << j + 1 << " ";
                    j++;
                }
                j = 0;
                break;
            }
            else {
                if (shipsNew[i - 1][j] == 'B') {
                    cout << " \tx ";
                }
                else cout << " \t" << shipsNew[i - 1][j] << " ";
            }
        }
        cout << "\n";
    }
    cout << "---++++++++==================++++++++---\n";
};

int main()
{
    int userRow, userColumn, numBoats;

    cout << "---*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*---\n";
    cout << "Row/Col \t0 \t1 \t2 \t3\n";
    cout << "---*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*---\n";
    cout << "Line 0\t \tx \tx \tx \tx\n";
    cout << "Line 1\t \tx \tx \tx \tx\n";
    cout << "Line 2\t \tx \tx \tx \tx\n";
    cout << "Line 3\t \tx \tx \tx \tx\n";
    cout << "---*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*---\n";


    cout << "\nSpecify the size of the Battlefield\n";
    cout << "How many Rows of the Battlefield (2-4): ";
    cin >> userRow;
    cout << "How many Columns of the Battlefield (2-4): ";
    cin >> userColumn;
    cout << "\n\n";

    drawTheBattlefield(userRow, userColumn);
    cout << "\nHow many Rows Boats to play with: ";
    cin >> numBoats;

    int rowBoat, colBoat;

    for (int i = 0; i < numBoats; i++) {
        cout << "-==\nCoordinates for boat " << i+1;
        cout << "\n";
        cout << "-==Boat " << i + 1 << " Line: ";
        cin >> rowBoat;
        cout << "-==Boat " << i + 1 << " Column: ";
        cin >> colBoat;
        shipsNew[rowBoat-1][colBoat-1] = 'B';
    }

    drawTheBattlefield(userRow, userColumn);
    

    /*
    // We put "1" to indicate there is a ship.
    bool ships[4][4] = {
      { 0, 1, 1, 0 },
      { 0, 0, 0, 0 },
      { 0, 0, 1, 0 },
      { 0, 0, 1, 0 }
    };
    */

    // Keep track of how many hits the player has and how many turns they have played in these variables
    int hits = 0;
    int numberOfTurns = 0;

    // Allow the player to keep going until they have hit all four ships
    while (hits < numBoats) {
        int row, column;
        cout << "\n";
        cout << "\nNumber of Boats:\t" << numBoats << "\n";

        cout << "\nSelecting coordinates\n";

        // Ask the player for a row
        cout << "Choose a Row: ";
        cin >> row;

        // Ask the player for a column
        cout << "Choose a Col: ";
        cin >> column;

        // Check if a ship exists in those coordinates
        if (shipsNew[row - 1][column - 1] == 'B') {
            // If the player hit a ship, remove it by setting the value to zero.
            shipsNew[row - 1][column - 1] = '*';
            drawTheBattlefield(userRow, userColumn);
            

            // Increase the hit counter
            hits++;

            // Tell the player that they have hit a ship and how many ships are left
            cout << "\n--=== Hit! ===--" << (numBoats - hits) << "\tships remain.\n\n";
        }
        else {
            // Tell the player that they missed
            shipsNew[row - 1][column - 1] = '~';
            drawTheBattlefield(userRow, userColumn);
            cout << "\n--=== Miss :( ===--\nTry again";            
        }

        // Count how many turns the player has taken
        numberOfTurns++;
    }

    cout << "--~~~=======V=======~~~--\n";
    cout << "\tVictory!\n";
    cout << "\tVictory!\n";
    cout << "\tVictory!\n";
    cout << "--~~~=======V=======~~~--\n";
    cout << "\tYou won in " << numberOfTurns << " turns\n\n";
    system("pause");
}