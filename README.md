# Java-Project

# Hostel Leave Management System

A comprehensive Hostel Leave Management System developed using Java and Swing.

## Technologies Used

- Java
- Swing (GUI)
- File I/O

## Features

- User Authentication
- Leave Management
- Complaints Submission
- Real-time Announcements
- Dynamic Forms
- Data Storage
- User-friendly Interface

## Usage Instructions

1. **Login:**
   - Launch the application.
   - Enter your login credentials (e.g., login ID and password).

2. **Leave Application:**
   - Click "Apply for Leave."
   - Fill out the leave application form.
   - Click "Apply" to submit the leave request.
   - Click "Refresh" to clear the form.

3. **Complaint Submission:**
   - Click "Complaints."
   - Provide complaint details including category and urgency.
   - Click "SUBMIT" to submit the complaint.
   - Click "REFRESH" to clear the form.

4. **Announcements:**
   - Click "Announcements" to view real-time updates.

## Code Overview

- **Login:** Handles user authentication.
- **Home Screen:** Displays main options.
- **Leave Form:** Allows leave application and data storage.
- **Complaint Form:** Enables complaint submission.
- **Announcement Form:** Admin can make announcements.

## Installation

1. Clone the repository.
2. Ensure Java is installed.
3. Compile and run the Main class.

## Screenshots

## 1. User Registration:
   
   The system allows hostel administrators, students, and parents/guardians to register and create their accounts with relevant details. Each user type will have different access levels and 
permissions.

   **User Types:** The Hostel Leave Manager typically supports different user types, each with specific roles and permissions. The main user types are:

   - **Student:** Students are the primary users who request leaves. They register using their personal details such as name, contact information, student ID, and any other relevant information required by the hostel administration.
  
   - **Parent/Guardian:** If the student is a minor, the system allows parents or guardians to register and link their account to the student's profile. This allows parents to receive notifications and stay updated on the leave requests and approvals.
  
   - **Hostel Warden/Administrator:** Hostel wardens or administrators are responsible for overseeing the leave approval process. They register with their official credentials and are granted access to manage leave requests, approve or reject them, and perform other administrative tasks.

![Screenshot 2023-09-23 132426](https://github.com/piyush901255/Java-Project/assets/142660350/5d995d96-95ef-480b-9443-25ff3d88eb52)

Figure 1: As the Program is executed, the GUI pops up asking for the Registered User Id and Password for the Security reasons.

   ![Screenshot 2023-09-23 132436](https://github.com/piyush901255/Java-Project/assets/142660350/616e8025-c14a-41d7-b8ee-d606ce9fbbce)

Figure 2: Incorrect Pop up appears if any credentials found incorrect.

## 2. Dashboard

   The Dashboard shows the heading as NITTE Hostels, NMIT College, followed by a subheading as the location of the College.

   It is followed by three options:

   - **Apply For Leave:**
If the student wants to apply for leave or out pass, he/she must click the Apply For Leave button.

   - **Complaints:**
A dedicated section for accessing complaints faced by the students, such as fan is not working, or contact information for the system's support team, can be available on the dashboard.

   - **Announcements:**
Important Notifications: The dashboard may feature a notification centre where users can receive updates, reminders, or alerts related to their leave requests or other hostel-related announcements.


![Screenshot 2023-09-23 132454](https://github.com/piyush901255/Java-Project/assets/142660350/af288c30-a629-4a2c-b1d5-74b7abf72b93)

Figure 3: Dashboard - Select your field of interest.

## 3. Leave Request Submission Form

   The Leave Request Submission Form in the Hostel Leave Manager is a crucial component that enables students to formally request permission to leave the hostel for a specific duration. It is designed to gather essential information from the students, ensuring that the hostel administration can make informed decisions while processing the leave requests. Here are more details on what the Leave Request Submission Form typically includes:

   - **Leave Details:**
     
      Leave Start Date and Time: The date and time when the student intends to leave the hostel.
   
      Leave End Date and Time: The date and time when the student plans to return to the hostel.
   
      Reason for Leave: A dropdown or text box where the student can specify the reason for the leave, such as medical, personal, family event, etc.
   
   - **Parent/Guardian Information:**
     
      Name of Parent/Guardian: If the student is a minor, the form may require the name of the responsible parent or guardian.
     
      Parent/Guardian Contact Information: Phone number of the parent or guardian is fixed and cannot be edited by the students end. It can only be changed as per the request by the Hostel In charge.

   - **Emergency Contact:**
     
      Name of Emergency Contact: The name of a person to be contacted in case of an emergency.
     
      Emergency Contact Relationship: The relationship of the emergency contact to the student (e.g., parent, sibling, relative).
     
      Emergency Contact Number: Phone number of the emergency contact.
     
   - **Terms and Conditions:**
      The form may include a checkbox or statement asking the student to agree to the hostel's terms and conditions regarding leave requests. This ensures that students are aware of the rules and policies related to leaves.
   
   - **Submission and Confirmation:**

      A "Submit" button: After filling in all the required information, the student clicks this button to submit the leave request.
      Confirmation Message: Upon successful submission, a confirmation message is displayed, indicating that the request has been received and is pending review.
   
   - **Note to the Approval:**

      It includes the place of Visit and the mode of transport. It's important to design the Leave Request Submission Form to be user-friendly and intuitive. The form should be accessible on various devices, such as desktops, laptops, tablets, and smartphones. Additionally, the form may include input validation to ensure that all required fields are filled in correctly before submission.

   Once the student submits the leave request, it enters the approval workflow, where hostel administrators or wardens review the request and either approve or reject it based on the hostel's policies and availability. Throughout the process, the system should provide real time updates to the student and, if applicable, the parent/guardian, keeping them informed about the status of the leave request.

   ![Screenshot 2023-09-23 132509](https://github.com/piyush901255/Java-Project/assets/142660350/08bb417f-f57a-4bf6-8226-d5ab2c923f31)

   Figure 4: Leave Request Submission

   The Leave Submission Form is connected to the database.txt file which stores the data entered by the student. The Database keeps the record of the leave applied by the students.

   ![Picture1](https://github.com/piyush901255/Java-Project/assets/142660350/0e5c8207-f06a-4edc-a416-43e4a23da66c)

   Table 1: Stores the data of Leave Request Submission
   
## 4. Complains Submission Form

   The "Complaints" feature refers to a module or functionality that allows hostel residents (students) to lodge complaints or raise issues related to their hostel stay or any other hostel related matters. The Complaints feature is an important aspect of hostel management as it enables students to communicate their concerns and allows the administration to address them promptly. Here are more details on how the Complaints feature typically works:
   
   a. **Submission Form:** The Complaints feature provides a dedicated form where students can submit their complaints. The form may include the following elements:
   
   - **Complaint Type:** A dropdown menu or selection options where the student can specify the type of complaint (e.g., infrastructure issues, maintenance, noise disturbances, hygiene concerns, etc.).
    - **Complaint Details:** An open text box where students can provide a detailed description of the complaint, including relevant information such as the location of the issue and any other specifics.
   
   b. **Urgency:** The Complaints feature may include a priority level selection to categorize the urgency of the issue. For example, students can mark their complaints as critical, medium, or low priority based on the severity of the problem.
   
   c. **Complaint Status Tracking:** The Complaints feature allows students to track the status of their complaints. They can view whether the complaint is under review, in progress, or resolved. Real-time updates keep the students informed about the progress made in 
addressing their concerns.

   The Complaints feature plays a vital role in maintaining a healthy and conducive living environment in the hostel. It fosters better communication between students and administrators, leading to timely resolutions and improved hostel management. Additionally, the feature allows hostel authorities to identify recurring issues and implement measures to address them effectively.


   ![Screenshot 2023-09-23 132534](https://github.com/piyush901255/Java-Project/assets/142660350/787c3f84-06f1-4512-94ff-2d97ae1ba2ab)

   Figure 5: Complains are made via this portal...!

   The data from Complaint Form is stored in the complains.txt file which is also kept for the future reference.
   
   ![Picture2](https://github.com/piyush901255/Java-Project/assets/142660350/d1f8ba94-d8c8-4257-a936-2e0de630b2dd)
   
   Table 2: Stores the data of Complains made by students
   
## 5. Announcement Form

   Certainly! In the README file's "Announcement" section, you should provide information about how announcements work in your Hostel Leave Management System. Here's what you can add:

### Announcement

   The Announcement feature in the Hostel Leave Management System allows administrators to broadcast important messages and updates to all users. It serves as a convenient way to keep students informed about hostel-related matters in real-time. Here are the key details:

   - **Viewing Announcements:** Users can access the announcements by clicking on the "Announcements" button on the home screen.

   - **Announcement Creation:** Administrators can create and post announcements by filling out the "Announcement Title" and "Announcement Content" fields in the Announcement Form.

   - **Real-time Updates:** When an administrator submits an announcement, it immediately appears in the announcements area on the home screen for all users to see.

   - **Data Storage:** All announcements are stored in a text file, ensuring that important information is preserved and can be referred to later.

   - **Refreshing Announcements:** Users have the option to refresh the announcements area to clear the display and see any new announcements that have been posted.

   - **Example Usage:** Administrators can utilize this feature to announce important dates, hostel policy changes, or any other updates relevant to the hostel's residents.

   The Announcement feature is a valuable communication tool that enhances transparency and ensures that all students are aware of important developments within the hostel.

   Additionally, you can include a screenshot of the announcement section from your application to provide a visual representation of how it looks.

   ![Screenshot 2023-09-23 132551](https://github.com/piyush901255/Java-Project/assets/142660350/1fc56942-5a31-4a92-a1f7-2b6fff5ed0a5)

   Figure 6: Announcements are made via this Portal...!

   The data from Announcement Form is stored in the announcements.txt file which is also kept for the future reference.
   
   ![Screenshot 2023-09-23 141135](https://github.com/piyush901255/Java-Project/assets/142660350/a9159bb7-dfea-4acb-ae5a-bf3b92f49842)

   Table 3: Stores the data of Announcements  

## Contributing

Contributions are welcome! Please follow the standard guidelines.

## Contact

For questions or feedback, reach out to [Piyush Narayan](mailto:piyush901255@gmail.com).
