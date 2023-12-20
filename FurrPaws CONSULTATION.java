<!-- res/layout/activity_consultation.xml -->

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <!-- Your consultation screen layout components go here -->

    <TextView
        android:id="@+id/textViewConsultationTitle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Online Consultation"
        android:textSize="18sp"
        android:layout_gravity="center"
        android:layout_marginBottom="16dp"/>

    <!-- Example text input for user's question -->
    <EditText
        android:id="@+id/editTextQuestion"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Ask your question"/>

    <!-- Example button to submit the consultation -->
    <Button
        android:id="@+id/btnSubmitConsultation"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Submit Consultation"
        android:layout_gravity="center"
        android:layout_marginTop="16dp"/>
</LinearLayout>
