package com.Alfian_19104019.helloittelkompurwokerto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HalamanDuaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_dua)
    }

    <Button
    android:id="@+id/btnPage"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_marginStart="161dp"
    android:layout_marginTop="28dp"
    android:layout_marginEnd="162dp"
    android:text="@string/change_page"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@+id/textView" />








}