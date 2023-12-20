<!-- res/layout/activity_main.xml -->

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <!-- Your main screen layout components go here -->

    <TextView
        android:id="@+id/textViewWelcome"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Welcome to FurrPaws!"
        android:textSize="18sp"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="16dp"/>

    <!-- Example button to navigate to the appointment activity -->
    <Button
        android:id="@+id/btnScheduleAppointment"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Schedule Appointment"
        android:layout_below="@id/textViewWelcome"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="16dp"/>
</RelativeLayout>