# FlorisBoard's feature roadmap & milestones

This feature roadmap intents to provide transparency to what I want to add
to FlorisBoard in the foreseeable future. Note that there are no ETAs for any
version milestones down below, experience says these won't hold anyways.

I try my best to release regularly, though some features take a lot longer
than others and thus releases can be spaced out a bit on the stable track.
If you are interested in following the development more closely, make sure to
follow along the beta track releases! These are generally more unstable but
you get new stuff faster and can provide early feedback, which helps a lot!

## 0.3.x
Releases in this section still follow the old versioning scheme, meaning the
patch number is a feature upgrade. As this naming convention is more confusing
than useful, beginning with v0.4.0 development a new release/development cycle will be
introduced.

### 0.3.14 (currently in progress, much is already implemented and working well)
- Re-write of the Preference core
  - Reduce redundancy in key/default value definitions
  - Avoid having to manually add redundant code for adding a new pref
  - Goes hand-in-hand with the Settings UI re-write
- Re-write of the Settings UI with Jetpack Compose
  - Also re-structure UI into a more list-like panel
  - Adjust theme colors of Settings a bit to make it more modern
  - Preview the keyboard at any time from within the Settings
  - Settings language different than device language
- Re-write the Setup UI in Jetpack Compose
  - Simplify screen based on previously discussed ideas and mock-ups
  - Improve backend setup logic
- Implement base-UI for extensions and further continue development
  of existing Flex (FlorisBoard extension) format
  - Allows for a continuous experience of customizing FlorisBoard in different areas
  - Planned what will use Flex:
    - Themes
    - Layouts (Characters, symbols, numeric, ...)
    - Composers for non-Latin script languages
    - Word suggestion dictionaries (in 0.4.0)
    - Spell check dictionaries
    - User dictionaries (not in 0.3.14)
    - Other features that require only data and no logic (not in 0.3.14)
- Maybe full backup of preferences? Not 100% confirmed though and may be pushed back
- Theme rework part I:
    - Custom key corner radius
    - Custom key border color (not shadow!!)
    - Re-work theme internals so they use Flex extension format and FlexCSS
- Improvement of the Smartbar
  - Allow to have multiple Smartbars
  - Better candidate view (in prep for 0.4.0)

### 0.3.15
- Hotfix release for possible bugs in the preference rework, may be skipped and 0.4.0 is directly released.

## 0.4.0
- Re-adding word suggestions (at least for Latin-based languages at first)
  - Importing the dictionaries as well as management relies on the Flex extension core and UI in Kotlin
  - Actually parsing and generating suggestions happens in C++ to avoid another OOM catastrophe like in 0.3.9/10
  - The actual format of the dictionary and word list source is not decided yet
- Community repository on GitHub for theme sharing across users (may be 0.5.0)

With this release the versioning scheme changes: the second number now indicates new features,
changes in the third "patch" number now indicates bug fixes for the stable track. The development
cycle for each 0.x release will have `-alphaXX`, `-betaXX` and `-rcXX` (release candidate) releases on the beta
track for interested people to follow along the development. The first release to follow the new scheme will be `0.4.0-alpha01`
on the beta track.

## 0.5.0
- Complete rework of the Emoji panel
  - Recently used / Emoji history
  - Emoji search
  - Emoji suggestions when using :emoji_name: syntax
  - Kaomoji panel implementation (the third tab which currently has "not yet implemented")
- Smartbar customization improvements
  - Quick actions customization (order and which buttons to show)
- Prepare FlorisBoard repository and app store presence for public beta release
  on Google Play (will go live with stable 0.5.0!!)
- Rework branding images and texts of FlorisBoard for the app stores
- Focus on stability and experience improvements of the app and keyboard

## 0.6.0
- Full on-board layout editor which allows users to create their own layouts
  without writing a JSON file
- Import/Export of custom layout files packed in Flex extensions

## Backlog / Features that MAY be added, even in versions not mentioned above if the feature implementation fits perfectly with another feature
- Theme rework part II
- Adaptive themes v2
- Voice-to-text with Mozilla's open-source voice service
- Text translation
- Glide typing better word detection
- Proximity-based key typo detection
- Floating keyboard
- Tablet mode / Optimizations for landscape input
- Stickers/GIFs
- FlorisBoard landing web page for presentation
- Implementing additional layouts
- Support for Tasker/Automate/MacroDroid plugins
- Support for WearOS/Smartwatches
- Handwriting
- ...
