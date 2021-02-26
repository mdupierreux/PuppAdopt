/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Puppy

val puppies = listOf(
    Puppy(
        name = "Bandy",
        race = "Russel Terrier",
        description = "The Jack Russell Terrier is a small terrier that has its origins in fox hunting in England. It is principally white-bodied and smooth, rough or broken-coated and can be any colour.",
        imgSrc = R.drawable.jack
    ),
    Puppy(
        name = "Bobby",
        race = "Rottweiler",
        description = "The Rottweiler is a breed of domestic dog, regarded as medium-to-large or large. The dogs were known in German as Rottweiler Metzgerhund, meaning Rottweil butchers' dogs, because their main use was to herd livestock and pull carts laden with butchered meat to market. This continued until the mid-19th century when railways replaced droving. Although still used to herd stock in many parts of the world, Rottweilers are now also used as search and rescue dogs, guard dogs, and police dogs.",
        imgSrc = R.drawable.rottweiler
    ),
    Puppy(
        name = "Good boy",
        race = "Appenzeller",
        description = "The Appenzeller Sennenhund is a medium-size breed of dog, one of the four regional breeds of Sennenhund-type dogs from the Swiss Alps. The name Sennenhund refers to people called Senn, herders in the Appenzell region of Switzerland.",
        imgSrc = R.drawable.appenzeller
    ),
    Puppy(
        name = "Andy",
        race = "Beagle",
        description = "The beagle is a breed of small hound that is similar in appearance to the much larger foxhound. The beagle is a scent hound, developed primarily for hunting hare (beagling). Possessing a great sense of smell and superior tracking instincts, the beagle is the primary breed used as detection dogs for prohibited agricultural imports and foodstuffs in quarantine around the world. The beagle is intelligent. It is a popular pet due to its size, good temper, and a lack of inherited health problems.",
        imgSrc = R.drawable.beagle
    ),
    Puppy(
        name = "Blackie",
        race = "Groenendael",
        description = "The Belgian Shepherd (also known as the Belgian Sheepdog or the Chien de Berger Belge) is a breed of medium-sized herding dog from Belgium. While predominantly considered a single breed, it is bred in four distinct varieties based on coat type and colour; the long-haired black Groenendael, the rough-haired fawn Laekenois, the short-haired fawn Malinois, and the long-haired fawn Tervuren; in the United States the American Kennel Club considers the four varieties to be separate breeds.",
        imgSrc = R.drawable.groenendael
    ),
    Puppy(
        name = "Casper",
        race = "Husky",
        description = "A husky is a sled dog used in the polar regions. One can differentiate huskies from other dog types by their fast pulling-style. They represent an ever-changing crossbreed of the fastest dogs (the Alaskan Malamute, by contrast, pulled heavier loads at a slower speed). Humans use huskies in sled-dog racing. Various companies have marketed tourist treks with dog sledges for adventure travelers in snow regions. Huskies are also kept as pets, and groups work to find new pet homes for retired racing and adventure-trekking dogs.",
        imgSrc = R.drawable.husky
    )
)
