// Generated by view binder compiler. Do not edit!
package ws.billy.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ws.billy.app.R;

public final class SpecificjournalBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView imgProfile;

  @NonNull
  public final TextView textName;

  private SpecificjournalBinding(@NonNull FrameLayout rootView, @NonNull ImageView imgProfile,
      @NonNull TextView textName) {
    this.rootView = rootView;
    this.imgProfile = imgProfile;
    this.textName = textName;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SpecificjournalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SpecificjournalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.specificjournal, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SpecificjournalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
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
      return new SpecificjournalBinding((FrameLayout) rootView, imgProfile, textName);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
