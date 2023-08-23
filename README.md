1. Go to GitHub and navigate to the main page of the repository.
2. Click on the `branches` tab (you should see a number indicating the current number of branches).
3. Click on the green button labeled `New Branch.`
4. Name the new branch as ``firstname-lastname.`` Replace firstname and lastname with your actual first name and last name.
5. Click `Create branch` or a similar confirmation button.
6. (watch the gif below for detailed instructions)

![image](https://im2.ezgif.com/tmp/ezgif-2-c6e2744805.gif)

7. Now, to work on this branch locally:

8. Open your terminal or command prompt.

9. Navigate to the directory where you want to clone the repository.

10. Clone the repository using the following command:
```bash
git clone https://github.com/DHS-CP/P5_GreenfootSeatingChartMaster2023-24.git
```
10. Navigate into the cloned directory:
```bash
cd P5_GreenfootSeatingChartMaster2023-24
```
11. Switch to the branch you just created with:
```bAsh
git checkout firstname-lastname
```
Make sure to replace firstname-lastname with the name of the branch you created.

12. Make your desired changes to the code or content.

13. Once you've made your changes, stage them with:
```bash
git add .
```
14. Commit your changes:
```bash
git commit -m "Brief description of your changes"
```
15. Push your changes back to GitHub:
```
git push origin firstname-lastname
```
16. Once you are done making all changes and have pushed them to GitHub, go back to the repository page on GitHub.
17. You should see a notification about your recent push. Click on the 'Contribute' or 'Compare & pull request' button under the green "Code" button (the exact label might differ based on the current GitHub UI).
18. Click 'Open pull request.'
19. Fill in any additional details or leave a comment about the changes you've made.
20. Click 'Create pull request' to submit your changes for review.

![image](https://im.ezgif.com/tmp/ezgif-1-8686549797.gif)

(Ignore the red X's those just mean we will review and approve later)
