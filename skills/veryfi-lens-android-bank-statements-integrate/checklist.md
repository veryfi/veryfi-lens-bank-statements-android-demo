# Validation checklist

Run this before delivering host code. Fix conflicts by removing extra flags.

- [ ] Dependency is `com.veryfi.lens:veryfi-lens-bank-statements-sdk:2.7.0.6`
- [ ] `documentTypes` is BANK_STATEMENT and engine is VeryfiCloudAPI
- [ ] Fraud documented as disabled for the bank-statement detector
- [ ] PDF path uses Uris or showDocumentBrowser
- [ ] `uploadImages` distinct from Headless
- [ ] Settings match the W-2 / W-9 recipe; no bank-statement-only flag
- [ ] Installed app size, not AAR size

- [ ] Every relative link in the generated host notes stays inside this skill folder
- [ ] Unconfirmed behavior the host depends on is labeled **Unconfirmed** in the delivery note
- [ ] Host `<application>` sets `android:allowBackup="false"` and `tools:replace="android:allowBackup"` so a new-project `true` does not fail the manifest merger
- [ ] No repository password, Demo `SettingsHolder` preset, or `VeryfiLensHelper` mutation is in the host code
