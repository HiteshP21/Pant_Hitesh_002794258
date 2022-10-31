## AED Assignment 2

## Hospital Management System


In this Hospital Management swing app, the user can create entities such as system admin, doctor, and patient. A list of all patients and doctors is visible to the system admin. The system admin can CREATE, READ, UPDATE, and DELETE a Hospital, Patient, and Doctor.

A Patient can check his/her Vital signs and book and view appointments with the doctor.

A Doctor can VIEW and ADD Vital Signs of his/her patients.


### Number of classes:
Person

Patient

Patient Dir

Doctor 

Doctor Dir

Hospital

Hospital Dir

Encounter 

Encounter Dir

Vital Signs

Vital Signs History

System Admin

Community 

Community Dir


## The person Class contains the following methods:

get-set :: community

get-set :: username

get-set :: email

get-set :: role

get-set :: gender

get-set :: dob

These methods are inherited by Doctor and Patient class for loging and registration puroses.

Seperate login panels have been created for Doctor, Patient and System Admin.

### Doctor: 

Required to register first.

Username and password required for login.

Can add vitals signs for active appointments

View current appointments

### Patient:

Requires registration and login.

Can view vitals added by doctor

Create appointment

View appointment



