// Generated by view binder compiler. Do not edit!
package ws.billy.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ws.billy.app.R;

public final class JournallayoutBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final RelativeLayout imageJournal;

  @NonNull
  public final ImageView imageMain;

  @NonNull
  public final ImageView imgProfile;

  @NonNull
  public final TextView textName;

  @NonNull
  public final TextView timeAgo;

  private JournallayoutBinding(@NonNull FrameLayout rootView, @NonNull RelativeLayout imageJournal,
      @NonNull ImageView imageMain, @NonNull ImageView imgProfile, @NonNull TextView textName,
      @NonNull TextView timeAgo) {
    this.rootView = rootView;
    this.imageJournal = imageJournal;
    this.imageMain = imageMain;
    this.imgProfile = imgProfile;
    this.textName = textName;
    this.timeAgo = timeAgo;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static JournallayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static JournallayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.journallayout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static JournallayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      RelativeLayout imageJournal = rootView.findViewById(R.id.imageJournal);
      if (imageJournal == null) {
        missingId = "imageJournal";
        break missingId;
      }
      ImageView imageMain = rootView.findViewById(R.id.imageMain);
      if (imageMain == null) {
        missingId = "imageMain";
        break missingId;
      }
      ImageView imgProfile = rootView.findViewById(R.id.imgProfile);
      if (imgProfile == null) {
        missingId = "imgProfile";
        break missingId;
      }
      TextView textName = rootView.findViewById(R.id.textName);
      if (textName == null) {
        missingId = "textName";
        break missingId;
      }
      TextView timeAgo = rootView.findViewById(R.id.timeAgo);
      if (timeAgo == null) {
        missingId = "timeAgo";
        break missingId;
      }
      return new JournallayoutBinding((FrameLayout) rootView, imageJournal, imageMain, imgProfile,
          textName, timeAgo);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
