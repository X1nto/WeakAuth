# WeakAuth
Disables Android's StrongAuth feature, letting you skip the "For additional security, use PIN/password/pattern instead" screen when trying to unlock with biometrics.

## Detailed explanation
Sometimes Android decides to force the PIN/password/pattern instead of letting you unlock your phone using the fingerprint sensor.
The cause of this can be any of the following:
- The device just booted/rebooted
- The internal timeout has been enforced (one of the main reasons)
- Too many incorrect attempts of unlocking the phone

and many more. The full list of flags that cause this can be found in the [AOSP source code](https://cs.android.com/android/platform/superproject/+/refs/heads/master:frameworks/base/core/java/com/android/internal/widget/LockPatternUtils.java;l=1529-1583;drc=7346c436e5a11ce08f6a80dcfeb8ef941ca30176).

While this feature is useful for remembering your PIN/password (and *some* security features which average users don't need), it's a bit annoying to not be able to unlock your phone right when you place your finger on the fingerprint sensor.

## Disclaimer
I'm not responsible for stolen memes, leaked government documents and/or you getting fired because your boss found out you have discord kittens.
YOU chose to give up security of your device for convenience. If you don't want to make it just a bit easier to unlock your device when you're sleeping, do NOT install this module.

## Credits
Special thanks to [Ven](https://github.com/Vendicated) for suggesting this idea.