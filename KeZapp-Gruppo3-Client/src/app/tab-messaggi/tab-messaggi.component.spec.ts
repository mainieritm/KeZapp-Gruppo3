import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TabMessaggiComponent } from './tab-messaggi.component';

describe('TabMessaggiComponent', () => {
  let component: TabMessaggiComponent;
  let fixture: ComponentFixture<TabMessaggiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TabMessaggiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TabMessaggiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
